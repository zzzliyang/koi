<template>
  <div id="app">
    <p>this is {{ msg }}</p>
  </div>
</template>

<script>
    export default {
      name: 'koi-sidebar',
      data () {
        return {
          msg: 'sidebar'
        }
      }
    }
</script>

<style>
    p {
      font-size: 25px;
      color: green;
    }
</style>
