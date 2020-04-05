<template>
  <div>
    <div></div>
    <div>
      <el-button class="blue" type="primary" @click="handleSubmit">提交</el-button>
      <el-button @click="reset">重置</el-button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'LeetcodeTest',
  components: {},
  data() {
    return {
      componentsDictionary: [{
        name: 'inventoryCheckMeterial',
        validated: true
      }, {
        name: 'inventoryCheckLocation',
        validated: true
      }],
      activeName: 'inventoryCheckMeterial',
      tableDictionary: ["inventoryCheckMeterial", "inventoryCheckLocation"]
    }
  },
  computed: {
    dialogStatus() {
      return this.dialogType === 0 ? '创建' : '编辑'
    },
    tableHeight() {
      return 'calc(100vh - 340px)'
    }
  },
  mounted() {
    this.getTab()
  },
  methods: {
    getTab() {
      const result = this.tableDictionary.find(item => item === this.$route.query.tabName)
      this.activeName = result ? result : this.activeName
    },
    handleChooseTab(data) {
      const path = this.$route.path;
      let location = {
        path,
        query: {
          tabName: data.name
        }
      }
      this.$router.push(location);
    },
    handleSubmit() {
     
    },
    reset() {
   
    },

  }
}

</script>

<style lang="scss" scoped></style>