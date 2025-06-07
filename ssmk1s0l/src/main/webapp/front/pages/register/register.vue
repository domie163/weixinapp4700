<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"340rpx 0px 198rpx","background":"url(http://codegen.caihongy.cn/20230303/944d235806784ae7b9d8d249fd3a8d42.jpg) no-repeat right top / 100%,#d8d6d2","height":"100%"}'>
		<view :style='{"padding":"220rpx 0px 160rpx","boxShadow":"0px 0px 0px #ddd","borderColor":"#f7d3ba","display":"flex","justifyContent":"center","borderRadius":"0px","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230303/8d9dd10feb1646c8a1e295d5a9ebf065.png) no-repeat center top / 80% 100%","borderWidth":"0 0px","width":"100%","position":"relative","borderStyle":"solid","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 auto 24rpx auto","borderRadius":"8rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" mode="aspectFill"></image>
			<view :style='{"width":"60%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='kehu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#f7d3ba","color":"#333","borderRadius":"0px","background":"#fff","borderWidth":"0 0 6rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"100rpx"}'  v-model="ruleForm.zhanghao"  type="text"  class="uni-input" name="" placeholder="账号" />
			</view>
			<view :style='{"width":"60%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='kehu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#f7d3ba","color":"#333","borderRadius":"0px","background":"#fff","borderWidth":"0 0 6rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"100rpx"}'  v-model="ruleForm.xingming"  type="text"  class="uni-input" name="" placeholder="姓名" />
			</view>
			<view :style='{"width":"60%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='kehu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#f7d3ba","color":"#333","borderRadius":"0px","background":"#fff","borderWidth":"0 0 6rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"100rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"60%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='kehu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#f7d3ba","color":"#333","borderRadius":"0px","background":"#fff","borderWidth":"0 0 6rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"100rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<picker :style='{"boxShadow":"0px 0px 0px #2c77cb","margin":"24rpx 0 24rpx 0","borderColor":"#f7d3ba","borderRadius":"0px","background":"#fff","borderWidth":"0 0 6rpx","width":"60%","borderStyle":"solid","height":"auto"}' v-if="tableName=='kehu'"  @change="kehuxingbieChange" :value="kehuxingbieIndex" :range="kehuxingbieOptions">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#767676"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
            <view :style='{"width":"60%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='kehu'" @tap="kehutouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"border":"0px solid #ccc","width":"200rpx","borderRadius":"16rpx","objectFit":"cover","display":"block","height":"160rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"border":"0px solid #ccc","width":"200rpx","borderRadius":"16rpx","objectFit":"cover","display":"block","height":"160rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"60%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='kehu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#f7d3ba","color":"#333","borderRadius":"0px","background":"#fff","borderWidth":"0 0 6rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"100rpx"}'  v-model="ruleForm.shoujihaoma"  type="text"  class="uni-input" name="" placeholder="手机号码" />
			</view>
			<view :style='{"width":"60%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='kehu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#f7d3ba","color":"#333","borderRadius":"0px","background":"#fff","borderWidth":"0 0 6rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"100rpx"}'  v-model="ruleForm.youxiang"  type="text"  class="uni-input" name="" placeholder="邮箱" />
			</view>
			<button :style='{"padding":"0px","boxShadow":"2rpx 4rpx 8rpx #ccc","margin":"40rpx auto 24rpx","borderColor":"#fb9a40","color":"#333","bottom":"-20rpx","display":"block","borderRadius":"60rpx","background":"linear-gradient(23deg, rgba(255,255,255,1) 0%, rgba(247,211,186,1) 100%)","borderWidth":"0 6rpx","width":"240rpx","lineHeight":"88rpx","fontSize":"28rpx","position":"absolute","borderStyle":"solid","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                kehuxingbieOptions: [],
                kehuxingbieIndex: 0,
				ruleForm: {
                zhanghao: '',
                xingming: '',
                mima: '',
                xingbie: '',
                touxiang: '',
                shoujihaoma: '',
                youxiang: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='kehu'){
                this.kehuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.kehuxingbieOptions[0]
			}
			
			this.styleChange()
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
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
                if(`kehu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if(`kehu` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				if(`kehu` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
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
