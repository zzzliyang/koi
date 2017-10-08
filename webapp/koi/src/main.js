import Vue from 'vue'
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
    MenuItemGroup
} from 'element-ui'
import 'element-ui/lib/theme-default/index.css'

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

new Vue({
  el: '#app',
  render: h => h(App)
})
