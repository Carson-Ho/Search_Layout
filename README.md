# SearchLayout
- 作者：Carson_Ho
- 概述

![示意图](http://upload-images.jianshu.io/upload_images/944365-4b63ff5c2fa72257.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

**注：关于该开源项目的意见 & 建议可在Issue上提出。欢迎 Star ！**

## 1. 简介
一款**封装了 历史搜索记录功能 & 样式** 的`Android`自定义搜索框
>已在`Github`开源：[地址：SearchLayout](https://github.com/Carson-Ho/Search_Layout)，欢迎 `Star` ！


![示意图](http://upload-images.jianshu.io/upload_images/944365-54bff60f16c6946d.gif?imageMogr2/auto-orient/strip)


## 2. 功能介绍
### 2.1 需求场景
![示意图](http://upload-images.jianshu.io/upload_images/944365-3463f141bd4078e8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 2.2 功能需求
- 功能列表

![示意图](http://upload-images.jianshu.io/upload_images/944365-d4c8747adcdafa04.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 功能原型

![示意图](http://upload-images.jianshu.io/upload_images/944365-2fabd5d54e32e8d3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)





### 2.3 功能示意

![示意图](http://upload-images.jianshu.io/upload_images/944365-54bff60f16c6946d.gif?imageMogr2/auto-orient/strip)


## 3. 特点
### 3.1 功能实用
- 该搜索框开源库具备除了历史搜索记录功能外，还具备一般的搜索框功能（如一键清空搜索框内容等等）
- 封装了 **常见的搜索框样式**（如左侧图标、返回按键等等），使用起来更加方便

### 3.2 使用简单
仅需要简单的`xml`属性配置
>下面1节会详细介绍其使用方法

### 3.3 二次开发成本低
- 本项目已在 `Github`上开源：[地址：SearchLayout](https://github.com/Carson-Ho/Search_Layout)
- 具备详细的源码分析文档：请看文章[Android开源库：手把手教你实现一个简单好用的搜索框（含历史搜索记录）](http://www.jianshu.com/p/590f00025de3)

所以，在其上做二次开发 & 定制化成本非常低。




# 4. 具体使用
该款[SearchLayout](https://github.com/Carson-Ho/Search_Layout)使用非常简单，仅需2步：

### 步骤1：导入控件库
主要有 `Gradle` & `Maven` 2种方式：

- 方式1：`Gradle`引入依赖
*build.Gradle*

```
dependencies {
    compile 'com.carson_ho:SearchLayout:1.0.1'
}
```

- 方式2：`Maven`引入依赖
*pom.xml*
```
<dependency>
  <groupId>com.carson_ho</groupId>
  <artifactId>SearchLayout</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```


### 步骤2：设置搜索框样式

- 具体属性设置




![示意图](http://upload-images.jianshu.io/upload_images/944365-ccb751def7c514f3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)





- 使用示例
在`XML`文件中进行设置
*activity_main.xml*
```
<scut.carson_ho.searchview.SearchView
        android:id="@+id/search_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:textSizeSearch="5dp"
        app:textColorSearch="#3F51B5"
        app:textHintSearch="输入查询关键字"
        app:searchBlockHeight="150"
        app:searchBlockColor="#ffffff"
        />
```


### 步骤3：设置点击键盘上的搜索按键 & 返回按键后的操作
*MainActivity.java*
```
// 1. 初始化搜索框变量
    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 2. 绑定视图
        setContentView(R.layout.activity_search);

        // 3. 绑定组件
        searchView = (SearchView) findViewById(R.id.search_view);

        // 4. 设置点击键盘上的搜索按键后的操作（通过回调接口）
        // 参数 = 搜索框输入的内容
        searchView.setOnClickSearch(new ICallBack() {
            @Override
            public void SearchAciton(String string) {
                System.out.println("我收到了" + string);
            }
        });
        
        // 5. 设置点击返回按键后的操作（通过回调接口）
        searchView.setOnClickBack(new bCallBack() {
            @Override
            public void BackAciton() {
                finish();
            }
        });
    }
}
```




# 5. 完整Demo地址
[Carson_Ho的Github地址：SearchLayout](https://github.com/Carson-Ho/Search_Layout)

![示意图](http://upload-images.jianshu.io/upload_images/944365-54bff60f16c6946d.gif?imageMogr2/auto-orient/strip)



## 6.  源码解析
请看文章[Android开源库：手把手教你实现一个简单好用的搜索框（含历史搜索记录）](http://www.jianshu.com/p/590f00025de3)



## 7.  开源协议

`SearchLayout` 遵循 `MIT` 开源协议

## 8. 贡献代码
- 具体请看：[贡献代码说明](https://github.com/Carson-Ho/Search_Layout/blob/master/CONTRIBUTING.md)
- 关于该开源项目的意见 & 建议可在`Issue`上提出。欢迎 Star ！

## 9. 版本说明
2017-08-11 v1.0.0 ：基础功能上线（关键字搜索、历史搜索记录 & 一键删除功能）

# 关于作者
- ID：Carson_Ho
- 简介：CSDN签约作者、简书推荐作者、稀土掘金专栏作者
- E - mail：[carson.ho@foxmail.com](mailto:carson.ho@foxmail.com)
- Github：[https://github.com/Carson-Ho](https://github.com/Carson-Ho)
- CSDN：[http://blog.csdn.net/carson_ho](http://blog.csdn.net/carson_ho)
- 简书：[http://www.jianshu.com/u/383970bef0a0](http://www.jianshu.com/u/383970bef0a0)
- 稀土掘金：[https://juejin.im/user/58d4d9781b69e6006ba65edc](https://juejin.im/user/58d4d9781b69e6006ba65edc)
