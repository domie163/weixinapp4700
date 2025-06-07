<template>
<view class="content">
	<view :style='{"minHeight":"100vh","padding":"0px 0 80rpx","borderColor":"#21d5ae","background":"url(http://codegen.caihongy.cn/20230301/28586bd575de4721a42223a6e1d4b118.png) fixed","borderWidth":"0px 0 0","width":"100%","position":"relative","borderStyle":"dashed","height":"auto"}'>
		<form :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">物品编号</view>
				<view :style='{"padding":"0px 24rpx","margin":"0px","fontSize":"28rpx","color":"#666","flex":"1"}' class="right-input">
					{{ruleForm.wupinbianhao}}
				</view>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">物品名称</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx"}' :disabled="ro.wupinmingcheng" v-model="ruleForm.wupinmingcheng" placeholder="物品名称"></input>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 20rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">物品分类</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="wupinfenleiChange" :value="wupinfenleiIndex"  :range="wupinfenleiOptions">
					<view :style='{"width":"100%","lineHeight":"120rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.wupinfenlei?ruleForm.wupinfenlei:"请选择物品分类"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="" @tap="wupinfengmianTap">
				<view :style='{"width":"auto","padding":"0 20rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">物品封面</view>
				<image :style='{"width":"72rpx","margin":"12rpx 0","borderRadius":"100%","objectFit":"cover","display":"block","height":"72rpx"}' class="avator" v-if="ruleForm.wupinfengmian" :src="baseUrl+ruleForm.wupinfengmian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"72rpx","margin":"12rpx 0","borderRadius":"100%","objectFit":"cover","display":"block","height":"72rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">物品数量</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx"}' :disabled="ro.wupinshuliang" v-model="ruleForm.wupinshuliang" placeholder="物品数量"></input>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">物品价格</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx"}' :disabled="ro.wupinjiage" v-model="ruleForm.wupinjiage" placeholder="物品价格"></input>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx","borderColor":"#f7d3ba","borderRadius":"0px","borderWidth":"0 0 6rpx","background":"#fff","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">物品简介</view>
				<textarea :style='{"border":"0","minHeight":"240rpx","padding":"40rpx 40rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx"}' v-model="ruleForm.wupinjianjie" placeholder="物品简介"></textarea>
			</view>
			
			
			<view :style='{"padding":"0","margin":"60rpx 0 0 0","background":"none","display":"flex","width":"100%","justifyContent":"center","height":"auto"}' class="btn" >
				<button :style='{"padding":"0 40rpx","boxShadow":"2rpx 8rpx 8rpx #ddd","margin":"0 40rpx 0 0","borderColor":"#fb9a40","color":"#333","display":"inline","minWidth":"200rpx","borderRadius":"0px","background":"linear-gradient(23deg, rgba(255,255,255,1) 0%, rgba(247,211,186,1) 100%)","borderWidth":"0px 6rpx","width":"auto","lineHeight":"72rpx","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				wupinbianhao: this.getUUID(),
				wupinmingcheng: '',
				wupinfenlei: '',
				wupinfengmian: '',
				wupinjianjie: '',
				wupinshuliang: '',
				wupinjiage: '',
				},
				wupinfenleiOptions: [],
				wupinfenleiIndex: 0,
				// 登录用户信息
				user: {},
                ro:{
                   wupinbianhao : false,
                   wupinmingcheng : false,
                   wupinfenlei : false,
                   wupinfengmian : false,
                   wupinjianjie : false,
                   wupinshuliang : false,
                   wupinjiage : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 下拉框
			res = await this.$api.option(`wupinfenlei`,`wupinfenlei`,{});
			this.wupinfenleiOptions = res.data;
            this.wupinfenleiOptions.unshift("请选择物品分类");

			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`ershouwupin`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='wupinbianhao'){
					this.ruleForm.wupinbianhao = obj[o];
					this.ro.wupinbianhao = true;
					continue;
					}
					if(o=='wupinmingcheng'){
					this.ruleForm.wupinmingcheng = obj[o];
					this.ro.wupinmingcheng = true;
					continue;
					}
					if(o=='wupinfenlei'){
					this.ruleForm.wupinfenlei = obj[o];
					this.ro.wupinfenlei = true;
					continue;
					}
					if(o=='wupinfengmian'){
					this.ruleForm.wupinfengmian = obj[o].split(",")[0];
					this.ro.wupinfengmian = true;
					continue;
					}
					if(o=='wupinjianjie'){
					this.ruleForm.wupinjianjie = obj[o];
					this.ro.wupinjianjie = true;
					continue;
					}
					if(o=='wupinshuliang'){
					this.ruleForm.wupinshuliang = obj[o];
					this.ro.wupinshuliang = true;
					continue;
					}
					if(o=='wupinjiage'){
					this.ruleForm.wupinjiage = obj[o];
					this.ro.wupinjiage = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数



			// 下拉变化
			wupinfenleiChange(e) {
				this.wupinfenleiIndex = e.target.value
				this.ruleForm.wupinfenlei = this.wupinfenleiOptions[this.wupinfenleiIndex]
			},

			wupinfengmianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.wupinfengmian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {















//跨表计算判断
				var obj;
				if(this.ruleForm.wupinshuliang&&(!this.$validate.isIntNumer(this.ruleForm.wupinshuliang))){
					this.$utils.msg(`物品数量应输入整数`);
					return
				}
				if(this.ruleForm.wupinjiage&&(!this.$validate.isNumber(this.ruleForm.wupinjiage))){
					this.$utils.msg(`物品价格应输入数字`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
                    uni.setStorageSync('crossCleanType',true);
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`ershouwupin`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`ershouwupin`, this.ruleForm);
						}else{
							await this.$api.add(`ershouwupin`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`ershouwupin`, this.ruleForm);
					}else{
						await this.$api.add(`ershouwupin`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
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
