import Vue from 'vue'
import Vuex from 'vuex'
import App from './App.vue'
import {
    Button,
    Select,
    Row,
    Col,
    Pagination,
    Table,
    TableColumn,
    Form,
    FormItem,
    Input,
    Dialog,
    Option,
    Menu,
    Submenu,
    MenuItem,
    MenuItemGroup,
    Card
} from 'element-ui'
import 'element-ui/lib/theme-default/index.css'

Vue.use(Vuex)
Vue.use(Button)
Vue.use(Select)
Vue.use(Row)
Vue.use(Col)
Vue.use(Pagination)
Vue.use(Table)
Vue.use(TableColumn)
Vue.use(Form)
Vue.use(FormItem)
Vue.use(Input)
Vue.use(Dialog)
Vue.use(Option)
Vue.use(Menu)
Vue.use(Submenu)
Vue.use(MenuItem)
Vue.use(MenuItemGroup)
Vue.use(Card)

const store = new Vuex.Store({
  state: {
    header: 'Koi App',
    selectedMenu: ''
  },
  getters: {
    selectedMenu: state => state.selectedMenu,
    header: state => state.header
  },
  mutations: {
    menuChange: (state, payload) => {
      state.selectedMenu = payload
    }
  }
})

new Vue({
  el: '#app',
  store: store,
  render: h => h(App)
})
