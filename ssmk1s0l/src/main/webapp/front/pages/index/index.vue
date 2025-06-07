<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"0 0 200rpx","background":"url(http://codegen.caihongy.cn/20230301/7556a30fbb784d0084d649f21711175c.png) no-repeat left bottom,url(http://codegen.caihongy.cn/20230301/28586bd575de4721a42223a6e1d4b118.png) fixed","height":"auto"}'>
		<swiper :style='{"padding":"40rpx 0 80rpx ","boxShadow":"inset 0px 0px 0px 0px #f4ead8","borderColor":"#fb9a40","outline":"0px solid #bbb","margin":"0px auto","borderRadius":"0px","background":"#e6e7e5","borderWidth":"0 0 0px","width":"calc(100% - 0px)","borderStyle":"solid","height":"500rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='true' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='true'>
			<swiper-item :style='{"width":"calc(100% - 40rpx)","margin":"0 auto","position":"relative","borderRadius":"0px","background":"none","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"calc(100% - 40rpx)","margin":"16rpx auto","objectFit":"cover","borderRadius":"0px","display":"block","height":"360rpx"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"padding":"0 20rpx 32rpx","color":"#333","left":"20rpx","textAlign":"center","background":"rgba(255,255,255,.6)","bottom":"0px","width":"calc(100% - 40rpx)","lineHeight":"60rpx","fontSize":"28rpx","position":"absolute"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"0px 40rpx 180rpx","boxShadow":"inset 0px 0px 0px 0px #87acf1","margin":"0px auto 60rpx","borderColor":"#ddd","display":"flex","outline":"0px solid #ccc","borderRadius":"0px","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230301/31f371162a68497ba453dc20f6771f56.png) no-repeat right bottom,#e6e7e5","borderWidth":"0px 0 0","width":"calc(100% - 0px)","borderStyle":"solid","height":"auto"}'>
            <block v-for="item in menuList" v-bind:key="item.roleName">
                <block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
                    <block v-bind:key="sort" v-for=" (child,sort) in menu.child">
                        <block v-bind:key="sort2" v-for=" (button,sort2) in child.buttons">
                            <view :style='{"width":"25%","padding":"20rpx 0","margin":"0","borderRadius":"100%","background":"none","height":"auto"}' class="menu-list" v-if="button=='查看' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' " @tap="onPageTap2('../'+child.tableName+'/list')">
                                <view class="iconarr" :class="child.appFrontIcon" :style='{"padding":"0px","margin":"0px auto","color":"#333","borderRadius":"100%","background":"none","display":"block","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","height":"64rpx"}'></view>
                                <view :style='{"padding":"0","margin":"12rpx auto 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>{{child.menu.split("列表")[0]}}</view>
                            </view>
                        </block>
                    </block>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<view class="listBox recommend">
			<view v-if="false && 1 == 1" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"padding":"0 0 0 80rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"80rpx auto 40rpx","overflow":"hidden","borderRadius":"0","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230301/88664a517d6a44788449b2505911e6af.png) no-repeat left top / auto 100%,#a6aa9c","width":"calc(90% - 40rpx)","lineHeight":"80rpx","height":"80rpx"}'>
				<view :style='{"padding":"0 100rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"0","color":"#fff","textAlign":"center","display":"inline-block","borderRadius":"0","background":"none","width":"auto","fontSize":"32rpx","lineHeight":"80rpx","fontWeight":"500","height":"80rpx"}'>社区公告推荐</view>
			</view>
			
			<view v-if="false && 1 == 2" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<!-- 样式1 -->
			<view class="list-box style1" :style='{"padding":"0px","boxShadow":"0 0px 0px rgba(0,0,0,.1)","margin":"0 auto","borderColor":"#21d5ae","display":"flex","justifyContent":"space-between","borderRadius":"0px","flexWrap":"wrap","background":"none","borderWidth":"0px 0px","width":"calc(100% - 0px)","borderStyle":"dashed","height":"auto"}'>
				<view @tap="onDetailTap('shequgonggao',product.id)" v-for="(product,index) in shequgonggaolist" :key="index" class="list-item" :style='{"border":"0px solid #f7de91","boxShadow":"0 0px 0px rgba(0,0,0,.1),inset 0px 0px 0px 0px #ffef92","padding":"20rpx","margin":"40rpx auto 40rpx","borderColor":"#eee #f7d3ba #eee","textAlign":"center","display":"flex","borderRadius":"0px","flexWrap":"wrap","background":"#fff","borderWidth":"0px 6rpx 0px","width":"44%","position":"relative","borderStyle":"solid","height":"auto"}'>
					<view :style='{"padding":"0px 20rpx","margin":"0 auto","whiteSpace":"nowrap","overflow":"hidden","color":"#333","textAlign":"center","background":"none","width":"96%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"2"}' class="list-item-title ">{{product.biaoti}}</view>
					<view :style='{"padding":"0px 20rpx","margin":"0 auto","whiteSpace":"nowrap","overflow":"hidden","color":"#333","textAlign":"center","background":"none","width":"96%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"2"}' class="list-item-title ">{{product.gonggaoleixing}}</view>
					<image :style='{"padding":"0","margin":"16rpx auto 0px","objectFit":"cover","borderRadius":"20rpx","display":"block","width":"100%","height":"240rpx","order":"1"}' class="list-item-image" mode="aspectFill" v-if="product.fengmian.substring(0,4)=='http'" :src="product.fengmian"></image>
					<image :style='{"padding":"0","margin":"16rpx auto 0px","objectFit":"cover","borderRadius":"20rpx","display":"block","width":"100%","height":"240rpx","order":"1"}' class="list-item-image" mode="aspectFill" v-else :src="product.fengmian?baseUrl+product.fengmian.split(',')[0]:''"></image>
				</view>
			</view>
			
			
			
			  
			
			
			  
			
			  
			<view v-if="false && 1 == 3" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
		<!-- 商品推荐 -->
		

		<!-- 新闻资讯 -->
																																																						<view class="listBox news">
			<view v-if="false && 1 == 1" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"padding":"0px 0 0 80rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"80rpx auto 0px","overflow":"hidden","borderRadius":"0","background":"url(http://codegen.caihongy.cn/20230301/88664a517d6a44788449b2505911e6af.png) no-repeat left top / auto 100%,#a6aa9c","display":"flex","width":"calc(90% - 40rpx)","lineHeight":"80rpx","justifyContent":"space-between","height":"80rpx"}'>
				<view :style='{"padding":"0 0 0 80rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"0px 0 0","color":"#fff","textAlign":"center","display":"inline-block","minWidth":"240rpx","borderRadius":"0px","background":"url() no-repeat right top / auto 100%","width":"calc(100% - 160rpx)","fontSize":"32rpx","lineHeight":"80rpx","fontWeight":"500","height":"80rpx"}'>社区公告</view>
				<text :style='{"padding":"0 40rpx 0 0","margin":"0px 0px 0 0","fontSize":"28rpx","color":"#eee","background":"none"}' @tap="onPageTap('news')">查看更多</text>
			</view>
			
			<view v-if="false && 1 == 2" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
					  
						
						
		  <!-- 样式4 -->
		  		  
		  <!-- 样式5 -->
		  		  
		  <!-- 样式6 -->
		  		  <view class="news-box3" :style='{"width":"100%","padding":"0px 24rpx 24rpx","margin":"60rpx 0 40rpx","height":"auto"}'>
			<view @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news" :key="index" class="list-item" :style='{"padding":"8rpx 52rpx","margin":"0 0 32rpx","borderColor":"#f7d3ba","backgroundColor":"rgba(255,255,255,1)","borderRadius":"0px","borderWidth":"0 0 6rpx 0","width":"100%","position":"relative","borderStyle":"solid","height":"auto"}'>
			  <view :style='{"padding":"0","boxShadow":"0px 0px 0px rgba(153,153,153,.6)","margin":"-4rpx 0 0 0","backgroundColor":"#999","top":"50%","borderRadius":"100%","left":"24rpx","width":"12rpx","position":"absolute","height":"12rpx"}' class="dian"></view>
			  <view :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"100%","lineHeight":"72rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{item.title}}</view>
			  <view class="cuIcon-right" :style='{"padding":"0","margin":"-36rpx 8rpx 0 0","top":"50%","color":"#999","width":"32rpx","lineHeight":"72rpx","fontSize":"32rpx","position":"absolute","right":"0"}'></view>
			</view>
		  </view>
		  		  
		  <!-- 样式7 -->
		  		  
		  <!-- 样式8 -->
		  		  
		  <!-- 样式9 -->
		  			
			<view v-if="false && 1 == 3" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
						<!-- 新闻资讯 -->
				

		<!-- 商品列表 -->
																																																								<!-- 商品列表 -->
		
		

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
				iconArr: [
				  'cuIcon-same',
				  'cuIcon-deliver',
				  'cuIcon-evaluate',
				  'cuIcon-shop',
				  'cuIcon-ticket',
				  'cuIcon-cascades',
				  'cuIcon-discover',
				  'cuIcon-question',
				  'cuIcon-pic',
				  'cuIcon-filter',
				  'cuIcon-footprint',
				  'cuIcon-pulldown',
				  'cuIcon-pullup',
				  'cuIcon-moreandroid',
				  'cuIcon-refund',
				  'cuIcon-qrcode',
				  'cuIcon-remind',
				  'cuIcon-profile',
				  'cuIcon-home',
				  'cuIcon-message',
				  'cuIcon-link',
				  'cuIcon-lock',
				  'cuIcon-unlock',
				  'cuIcon-vip',
				  'cuIcon-weibo',
				  'cuIcon-activity',
				  'cuIcon-friendadd',
				  'cuIcon-friendfamous',
				  'cuIcon-friend',
				  'cuIcon-goods',
				  'cuIcon-selection'
				],
                role : '',
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				shequgonggaolist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            this.role = uni.getStorageSync("role");
            let table = uni.getStorageSync("nowTable");
            let res = await this.$api.session(table);
            this.user = res.data;
            this.tableName = table;
            let menus = menu.list();
            this.menuList = menus;
            this.menuList.forEach((item,key) => {
                if(this.role==item.roleName) {
                    item.frontMenu.forEach((item2,key2) => {
                        if(item2.child[0].buttons.indexOf("查看")>-1) {
                            this.swiperMenuList.push(item2);
                        }
                    })
                }
            })
        },
		async onShow() {
            let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.page('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
			// 社区公告
			res = await this.$api.list('news', {
				page: 1,
				limit: 6
			});
			this.news = res.data.list

			// 推荐信息
			res = await this.$api.recommend('shequgonggao', {                                              
                page: 1,
                limit: 4
            });
			this.shequgonggaolist = res.data.list

		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
            onPageTap2(url) {
                uni.setStorageSync("useridTag",0);
                uni.navigateTo({
                    url: url,
                    fail: function() {
                        uni.switchTab({
                            url: url
                        });
                    }
                });
            }
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
