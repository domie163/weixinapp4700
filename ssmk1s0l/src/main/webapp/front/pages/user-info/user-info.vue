<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","padding":"0px 0 0px","borderColor":"#21d5ae","background":"url(http://codegen.caihongy.cn/20230301/28586bd575de4721a42223a6e1d4b118.png) fixed","borderWidth":"0px 0 0","width":"100%","position":"relative","borderStyle":"dashed","height":"auto"}'>
		<view :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","display":"block","height":"auto"}'>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","alignItems":"center","display":"flex","minHeight":"100rpx","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='kehu'" class="">
				<view class="title" :style='{"padding":"0 20rpx","color":"#fb9a40","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"100rpx"}' disabled="true"  v-model="ruleForm.zhanghao" placeholder="账号"></input>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","alignItems":"center","display":"flex","minHeight":"100rpx","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='kehu'" class="">
				<view class="title" :style='{"padding":"0 20rpx","color":"#fb9a40","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"100rpx"}'   v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","alignItems":"center","display":"flex","minHeight":"100rpx","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='kehu'" class="">
				<view class="title" :style='{"padding":"0 20rpx","color":"#fb9a40","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>密码</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"100rpx"}'  type="password" v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
			<view v-if="tableName=='kehu'" :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","alignItems":"center","display":"flex","minHeight":"100rpx","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"padding":"0 20rpx","color":"#fb9a40","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}' class="title">性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}'  @change="kehuxingbieChange" :value="kehuxingbieIndex" :range="kehuxingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","alignItems":"center","display":"flex","minHeight":"100rpx","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='kehu'" @tap="kehutouxiangTap" class="">
				<view class="title" :style='{"padding":"0 20rpx","color":"#fb9a40","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>头像</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","alignItems":"center","display":"flex","minHeight":"100rpx","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='kehu'" class="">
				<view class="title" :style='{"padding":"0 20rpx","color":"#fb9a40","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>手机号码</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"100rpx"}'   v-model="ruleForm.shoujihaoma" placeholder="手机号码"></input>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","alignItems":"center","display":"flex","minHeight":"100rpx","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='kehu'" class="">
				<view class="title" :style='{"padding":"0 20rpx","color":"#fb9a40","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>邮箱</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"100rpx"}'   v-model="ruleForm.youxiang" placeholder="邮箱"></input>
			</view>
			<view :style='{"padding":"0","margin":"60rpx 0 0","background":"none","display":"flex","width":"100%","justifyContent":"center","height":"auto"}' class="btn">
				<button @tap="update()" class="cu-btn lg" :style='{"padding":"0 40rpx","boxShadow":"2rpx 8rpx 8rpx #ddd","margin":"0 20rpx","borderColor":"#fb9a40","color":"#333","minWidth":"200rpx","borderRadius":"0px","background":"linear-gradient(23deg, rgba(255,255,255,1) 0%, rgba(247,211,186,1) 100%)","borderWidth":"0px 6rpx","width":"auto","lineHeight":"72rpx","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>保存</button>
				<button @tap="logout()" class="cu-btn lg" :style='{"padding":"0 40rpx","boxShadow":"2rpx 8rpx 8rpx #ddd","margin":"0 20rpx","borderColor":"#ccc","color":"#666","minWidth":"200rpx","borderRadius":"0px","background":"linear-gradient(23deg, rgba(255,255,255,1) 0%, rgba(238,238,238,1) 100%)","borderWidth":"0px 6rpx","width":"auto","lineHeight":"72rpx","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				kehuxingbieOptions: [],
				kehuxingbieIndex: 0,
			}
		},
        components: {
            multipleSelect
        },
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='kehu'){
				this.kehuxingbieOptions = "男,女".split(',');
				this.kehuxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.kehuxingbieIndex = index;
					}
				});
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
            // 下拉变化
            kehuxingbieChange(e) {
                    this.kehuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.kehuxingbieOptions[this.kehuxingbieIndex]
            },
			kehutouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},

            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('. .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if(`kehu` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				if(`kehu` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			},

		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
