<template>
  <div id="app">
    <koi-header class="bg-purple-dark"></koi-header>
    <el-row class='container'>
      <el-col :span="8" class="menu">
        <koi-sidebar class="bg-purple"></koi-sidebar>
      </el-col>
      <el-col :span="12" class="content">
        <koi-table class="bg-purple-dark"></koi-table>
      </el-col>
    </el-row>
  </div>
</template>

<script>
    import KoiHeader from './components/KoiHeader.vue'
    import KoiSidebar from './components/KoiSidebar.vue'
    import KoiTable from './components/KoiTable.vue'

    export default {
      name: 'app',
      components: {
        KoiHeader,
        KoiSidebar,
        KoiTable
      }
    }
</script>

<style>
    .bg-purple-dark {
    background: #99a9bf;
    }
    .bg-purple {
      background: #d3dce6;
    }
</style>
