(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-ccfec9ce"],{"0944":function(t,a,s){"use strict";s.r(a);var e=function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",[e("nav-bar",[e("p",{attrs:{slot:"left"},slot:"left"},[t._v("消息")])]),e("dividing-line",[e("p",{attrs:{slot:"text"},slot:"text"},[t._v("公共群聊")])]),e("router-link",{attrs:{to:{path:"/groupChat"}}},[e("message-box",[e("img",{attrs:{slot:"pic",src:s("5a4f")},slot:"pic"}),e("p",{attrs:{slot:"name"},slot:"name"},[t._v("群聊")]),e("p",{attrs:{slot:"details"},slot:"details"},[t._v("这是一个公共的群聊")])])],1),e("dividing-line",[e("p",{attrs:{slot:"text"},slot:"text"},[t._v("匿名身份")])]),e("ul",t._l(t.avatarList,(function(a,s){return e("li",{key:s},[e("router-link",{attrs:{to:{path:"/singleChat",query:{toName:a.ava_name}}}},[e("message-box",[e("img",{attrs:{slot:"pic",src:a.avatar_img_url},slot:"pic"}),e("p",{attrs:{slot:"name"},slot:"name"},[t._v(t._s(a.ava_name))]),e("p",{attrs:{slot:"details"},slot:"details"},[t._v(t._s(a.description))])])],1)],1)})),0),e("main-tab-bar")],1)},i=[],n=(s("0fb7"),s("450d"),s("f529")),o=s.n(n),l=s("a7ac"),c=s("3180"),r=function(){var t=this,a=t.$createElement,s=t._self._c||a;return s("div",{staticClass:"dividing-line"},[s("div",{staticClass:"text"},[t._t("text")],2)])},u=[],d={name:"NavBar"},v=d,p=(s("c6a7"),s("2877")),f=Object(p["a"])(v,r,u,!1,null,"0d5c21cd",null),g=f.exports,m=function(){var t=this,a=t.$createElement,s=t._self._c||a;return s("div",{staticClass:"message-box",style:t.styleObject},[s("div",{key:"message-box-pic",staticClass:"pic"},[t._t("pic")],2),s("div",{staticClass:"info-box"},[s("div",{staticClass:"name"},[t._t("name")],2),s("div",{staticClass:"details"},[t._t("details")],2)])])},_=[],b={name:"MessageBox",props:{bgcolor:String},data:function(){return{styleObject:{backgroundColor:this.bgcolor}}}},x=b,h=(s("6466"),Object(p["a"])(x,m,_,!1,null,"1cfa4998",null)),C=h.exports,k={components:{MainTabBar:c["a"],NavBar:l["a"],MessageBox:C,DividingLine:g},data:function(){return{avatarList:[]}},mounted:function(){var t=this;this.$axios.get("/avatar/getAvatarData?end=7").then((function(a){t.avatarList=a.data.data.avatarList})).catch((function(t){console.log(t),o.a.error("出错了, 无法申请匿名身份")}))}},w=k,y=Object(p["a"])(w,e,i,!1,null,null,null);a["default"]=y.exports},"5a4f":function(t,a,s){t.exports=s.p+"img/group_chat.669aa551.svg"},6466:function(t,a,s){"use strict";s("cb57")},"6c6d":function(t,a,s){},c6a7:function(t,a,s){"use strict";s("6c6d")},cb57:function(t,a,s){}}]);
//# sourceMappingURL=chunk-ccfec9ce.cce15eb6.js.map