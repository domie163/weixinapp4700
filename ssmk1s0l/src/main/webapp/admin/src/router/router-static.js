import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import news from '@/views/modules/news/list'
    import examfailrecord from '@/views/modules/examfailrecord/list'
    import shenghuojiaofei from '@/views/modules/shenghuojiaofei/list'
    import examquestion from '@/views/modules/examquestion/list'
    import fankuixinxi from '@/views/modules/fankuixinxi/list'
    import ershouwupin from '@/views/modules/ershouwupin/list'
    import ershouwupinhuishou from '@/views/modules/ershouwupinhuishou/list'
    import exampaper from '@/views/modules/exampaper/list'
    import shenghuojiaofeichu from '@/views/modules/shenghuojiaofeichu/list'
    import wupinfenlei from '@/views/modules/wupinfenlei/list'
    import kehu from '@/views/modules/kehu/list'
    import shequgonggao from '@/views/modules/shequgonggao/list'
    import exampaperlist from '@/views/modules/exampaperlist/list'
    import gonggaoleixing from '@/views/modules/gonggaoleixing/list'
    import config from '@/views/modules/config/list'
    import examrecord from '@/views/modules/examrecord/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '社区公告',
        component: news
      }
      ,{
	path: '/examfailrecord',
        name: '错题本',
        component: examfailrecord
      }
      ,{
	path: '/shenghuojiaofei',
        name: '生活缴费',
        component: shenghuojiaofei
      }
      ,{
	path: '/examquestion',
        name: '试题管理',
        component: examquestion
      }
      ,{
	path: '/fankuixinxi',
        name: '反馈信息',
        component: fankuixinxi
      }
      ,{
	path: '/ershouwupin',
        name: '二手物品',
        component: ershouwupin
      }
      ,{
	path: '/ershouwupinhuishou',
        name: '二手物品回收',
        component: ershouwupinhuishou
      }
      ,{
	path: '/exampaper',
        name: '试卷管理',
        component: exampaper
      }
      ,{
	path: '/shenghuojiaofeichu',
        name: '生活缴费处',
        component: shenghuojiaofeichu
      }
      ,{
	path: '/wupinfenlei',
        name: '物品分类',
        component: wupinfenlei
      }
      ,{
	path: '/kehu',
        name: '客户',
        component: kehu
      }
      ,{
	path: '/shequgonggao',
        name: '社区公告',
        component: shequgonggao
      }
      ,{
	path: '/exampaperlist',
        name: '试卷列表',
        component: exampaperlist
      }
      ,{
	path: '/gonggaoleixing',
        name: '公告类型',
        component: gonggaoleixing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/examrecord',
        name: '考试记录',
        component: examrecord
      }
    ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
