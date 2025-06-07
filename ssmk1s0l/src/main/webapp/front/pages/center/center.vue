<template>
	<view class="content">
		<view :style='{"minHeight":"100vh","padding":"0 0 1600rpx","borderColor":"#21d5ae","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230301/28586bd575de4721a42223a6e1d4b118.png) fixed","borderWidth":"0px 0 0","display":"block","width":"100%","position":"relative","borderStyle":"dashed","height":"auto"}'>
			<view :style='{"padding":"40rpx 40rpx 200rpx","boxShadow":"inset 0px 0px 0px 0px #f7dcab","margin":"0px auto 20rpx","borderColor":"#e9be70","display":"flex","justifyContent":"space-between","borderRadius":"0","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230301/31f371162a68497ba453dc20f6771f56.png) no-repeat right bottom,#e6e7e5","borderWidth":"0px","width":"calc(100% - 0px)","position":"relative","borderStyle":"solid","height":"auto"}' @tap="onPageTap('../user-info/user-info')" class="header" v-bind:class="{'status':isH5Plus}">
				<view :style='{"padding":"0","margin":"0","alignItems":"flex-start","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 200rpx)","position":"static","height":"auto"}' v-if="tableName=='kehu'" class="userinfo">
					<image :style='{"padding":"0px","margin":"0px 0 20rpx","borderColor":"#1bd0a9","objectFit":"cover","textAlign":"center","right":"40rpx","borderRadius":"100%","background":"rgba(255,255,255,.6)","borderWidth":"0px","width":"160rpx","position":"absolute","borderStyle":"solid","height":"160rpx"}' :src="user.touxiang?baseUrl+user.touxiang:'/static/gen/upload.png'"></image>
					<view :style='{"padding":"16rpx 16rpx 40rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 auto","borderColor":"#f7d3ba","flexDirection":"column","display":"flex","float":"left","justifyContent":"center","minHeight":"344rpx","borderRadius":"0px","background":"rgba(255,255,255,1)","borderWidth":"0 6rpx 0","width":"100%","borderStyle":"solid","height":"auto"}' class="info">
						<view :style='{"padding":"4rpx 8rpx","borderColor":"#ccc","margin":"0 0 0px","color":"#333","borderWidth":"0 0 2rpx","width":"90%","lineHeight":"60rpx","fontSize":"24rpx","borderStyle":"dashed"}'>{{user.zhanghao}}<text v-if="user.vip&& user.vip=='是'">(VIP)</text></view>
					</view>
				</view>
				<view :style='{"padding":"20rpx 0 0","margin":"200rpx 0 0","borderColor":"#1bd0a9","alignItems":"flex-start","background":"none","borderWidth":"0px","display":"flex","width":"160rpx","borderStyle":"solid","justifyContent":"center","height":"auto"}' class="setting">
					<view :style='{"border":"0","width":"72rpx","lineHeight":"72rpx","fontSize":"72rpx","color":"#333","borderRadius":"0"}' class="cuIcon-settings"></view>
				</view>
			</view>
		
		
			<view :style='{"padding":"20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 auto 40rpx","borderColor":"#1bd0a9","display":"block","justifyContent":"space-between","borderRadius":"0px","flexWrap":"wrap","background":"none","borderWidth":"0px","width":"calc(100% - 80rpx)","borderStyle":"solid","height":"auto"}' class="list">

				<block v-for="item in menuList" v-bind:key="item.roleName">
					<block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.backMenu">
						<block v-bind:key="sort" v-for=" (child,sort) in menu.child">
							<view :style='{"padding":"0 8rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","borderColor":"#f7d3ba","margin":"0 0 20rpx","alignItems":"center","display":"flex","float":"left","borderRadius":"0px","borderWidth":"0px 0px 6rpx","background":"#fff","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"100rpx"}' v-if="child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' && child.tableName!='exampaper' && child.tableName!='examquestion' " @tap="onPageTap('../'+child.tableName+'/list?userid='+user.id+'&menuJump='+child.menuJump)" class="li" hover-class="hover">
								<view v-if="true" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"56rpx","color":"#fb9a40"}' :class="child.appFrontIcon"></view>
								<view :style='{"width":"100%","padding":"0 8rpx","lineHeight":"88rpx","fontSize":"28rpx","color":"#333","flex":"1"}' class="text">{{child.menu}}</view>
								<view v-if="true" :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"28rpx","color":"#fb9a40"}' class="cuIcon-right"></view>
							</view>
						</block>
					</block>
				</block>


			</view>
		</view>
	</view>
</template>
<script>
	import menu from '@/utils/menu'
	export default {
		data() {
			return {
				isH5Plus: true,
				user: {},
				tableName:'',
				role: '',
				menuList: [],
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
			};
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
		},
		async onShow(){
            uni.removeStorageSync("useridTag");
			this.role = uni.getStorageSync("role");
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
		},
		methods: {
			onPageTap(url) {
                uni.setStorageSync("useridTag",1);
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
		height: calc(100vh - 94px);
		box-sizing: border-box;
	}
</style>
