<template>
  <el-row :gutter="10">
    <div v-for="card in cards">
      <el-col :span="8">
        <koi-card :cardData="card">
        </koi-card>
      </el-col>
    </div>
  </el-row>
</template>

<script>
    import KoiCard from './KoiCard.vue'
    import Image1 from '../assets/logo.png'
    import Image2 from '../assets/logo2.png'

    export default {
      name: 'koi-table',
      computed: {
        msg: function() {
          return this.$store.getters.selectedMenu
        }
      },
      data() {
        return {
          cards: [
            {
              img: Image1,
              name: 'item 1'
            },
            {
              img: Image2,
              name: 'item 2'
            }
          ]
        }
      },
      components: {
        KoiCard
      }
    }
</script>

<style>
    p {
      font-size: 25px;
      color: green;
    }
</style>
