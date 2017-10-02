<template>
  <div id="app">
    <p>this is {{ msg }}</p>
  </div>
</template>

<script>
    export default {
      name: 'koi-header',
      data () {
        return {
          msg: 'header'
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
