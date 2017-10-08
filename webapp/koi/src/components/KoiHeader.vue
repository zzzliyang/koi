<template>
  <div>
    <p>this is {{ msg }}</p>
  </div>
</template>

<script>
    export default {
      name: 'koi-header',
      computed: {
        msg: function() {
          return this.$store.getters.header
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
