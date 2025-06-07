const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmk1s0l/",
            name: "ssmk1s0l",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmk1s0l/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "生活小助手微信小程序"
        } 
    }
}
export default base
