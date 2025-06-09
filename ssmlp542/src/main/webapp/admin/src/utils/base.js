const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmlp542/",
            name: "ssmlp542",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmlp542/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "毕业生跟踪调查反馈系统"
        } 
    }
}
export default base
