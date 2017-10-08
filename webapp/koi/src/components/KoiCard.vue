<template>
  <el-card :body-style="{ padding: '0px' }">
    <img :src="cardData.img" class="image">
    <div style="padding: 14px;">
      <span>{{ cardData.name }}</span>
      <div class="bottom clearfix">
        <el-button type="text" class="button">Operating button</el-button>
      </div>
    </div>
  </el-card>
</template>

<script>
    export default {
      name: 'koi-card',
      props: ['cardData']
    }
</script>

<style>
    p {
      font-size: 25px;
      color: green;
    }
</style>
