(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-75547816"],{"087d":function(t,e,a){"use strict";var s=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{attrs:{id:"dialog"}},[a("div",{attrs:{id:"dialog-box"}},[a("div",{staticClass:"dialog-box-item"},[a("div",[t._t("input")],2),a("div",[t._t("btn")],2)])])])},n=[],o={name:"DialogBox"},i=o,r=(a("32f2"),a("2877")),c=Object(r["a"])(i,s,n,!1,null,"c1dcf07c",null);e["a"]=c.exports},"1afe":function(t,e,a){"use strict";var s=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"chat-box"},[a("div",{staticClass:"left"},[t._t("left")],2),a("div",{staticClass:"center",style:t.styleObject},[t._t("center")],2),a("div",{staticClass:"right"},[t._t("right")],2)])},n=[],o={name:"ChatBox",props:{bgcolor:String},data:function(){return{styleObject:{backgroundColor:this.bgcolor}}}},i=o,r=(a("778a"),a("2877")),c=Object(r["a"])(i,s,n,!1,null,"40e1ed17",null);e["a"]=c.exports},2906:function(t,e,a){"use strict";a("f76d")},"32f2":function(t,e,a){"use strict";a("ddc5")},"61e7":function(t,e,a){t.exports=a.p+"img/avatar_male.971189ae.svg"},"778a":function(t,e,a){"use strict";a("973c")},"8cb2":function(t,e,a){t.exports=a.p+"img/avatar_female.ca9b5199.svg"},"973c":function(t,e,a){},a7ac:function(t,e,a){"use strict";var s=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"nav-bar"},[a("div",{staticClass:"left"},[t._t("left")],2),a("div",{staticClass:"center"},[t._t("center")],2),a("div",{staticClass:"right",on:{click:t.goback}},[t._t("right")],2)])},n=[],o={name:"NavBar",methods:{goback:function(){this.$router.go(-1)}}},i=o,r=(a("2906"),a("2877")),c=Object(r["a"])(i,s,n,!1,null,"b857f31e",null);e["a"]=c.exports},d5aa:function(t,e,a){"use strict";a.r(e);var s=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",[s("nav-bar",[s("p",{attrs:{slot:"left"},slot:"left"},[t._v("单聊")]),s("p",{attrs:{slot:"center"},slot:"center"},[t._v(t._s(t.toName))]),s("p",{attrs:{slot:"right"},slot:"right"},[t._v("返回《")])]),s("ul",t._l(t.msgList,(function(e,n){return s("li",{key:n},[e.fromName===t.fromName?s("p",[s("chat-box",{attrs:{bgcolor:"rgb(155, 233, 168)"}},[s("img",{attrs:{slot:"right",src:a("61e7")},slot:"right"}),s("p",{attrs:{slot:"center"},slot:"center"},[t._v(t._s(e.msg))])])],1):s("p",[s("chat-box",[s("img",{attrs:{slot:"left",src:a("8cb2")},slot:"left"}),s("p",{attrs:{slot:"center"},slot:"center"},[t._v(t._s(e.msg))])])],1)])})),0),s("dialog-box",[s("input",{directives:[{name:"model",rawName:"v-model",value:t.msg,expression:"msg"}],attrs:{slot:"input",type:"text",placeholder:"请输入聊天内容"},domProps:{value:t.msg},on:{input:function(e){e.target.composing||(t.msg=e.target.value)}},slot:"input"}),s("input",{attrs:{slot:"btn",type:"button",value:"发送"},on:{click:t.handleSendBtnClick},slot:"btn"})])],1)},n=[],o=a("a7ac"),i=a("087d"),r=a("1afe"),c=new WebSocket("ws://localhost:8000"),l={name:"SingleChat",components:{NavBar:o["a"],ChatBox:r["a"],DialogBox:i["a"]},data:function(){return{toName:this.$route.query.toName,fromName:localStorage.getItem("username"),msg:"",msgList:[]}},methods:{handleSendBtnClick:function(){c.send(JSON.stringify({toName:this.toName,fromName:this.fromName,msg:this.msg,isclosed:!1})),this.msgList.push({id:(new Date).toLocaleDateString(),fromName:this.fromName,msg:this.msg});var t=this;c.onmessage=function(e){var a=JSON.parse(e.data).msg,s=JSON.parse(e.data).fromName;t.msgList.push({id:(new Date).toLocaleDateString(),fromName:s,msg:a})}}}},u=l,m=a("2877"),g=Object(m["a"])(u,s,n,!1,null,null,null);e["default"]=g.exports},ddc5:function(t,e,a){},f76d:function(t,e,a){}}]);
//# sourceMappingURL=chunk-75547816.4797ef6a.js.map