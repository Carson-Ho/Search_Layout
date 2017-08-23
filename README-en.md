# SearchLayout
>[中文文档](https://github.com/Carson-Ho/DIY_View/blob/master/README.md)
- Author：Carson_Ho
- Summary

![示意图](http://upload-images.jianshu.io/upload_images/944365-a4adff8579db7cf6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




## 1. Introduction
a simple & useful  Android DIY View  for Searching function
>[Carson_Ho Github：SearchLayout](https://github.com/Carson-Ho/Search_Layout)，welcome  Star ！


![示意图](http://upload-images.jianshu.io/upload_images/944365-54bff60f16c6946d.gif?imageMogr2/auto-orient/strip)


## 2. Application Scenarios
Searching  & High Diy style



## 3. Feature
- Fresh & concise style
- Easy to use
- Secondary Programming costs are low

## 4. Usage

##### Step 1：Import Library
There are two ways to  import Library：

- 1. For Gradle
*build.Gradle*

```
dependencies {
    compile 'com.carson_ho:SearchLayout:1.0.1'
}
```

- 2. For Maven
*pom.xml*
```
<dependency>
  <groupId>com.carson_ho</groupId>
  <artifactId>SearchLayout</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```


##### Step 2：Set Animation Attributes
- Attributes Description：



![示意图](http://upload-images.jianshu.io/upload_images/944365-2d4f917de1b406ad.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




- Use examples

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


### Step 3：Setting actions when clicking search & back button

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

        // 4. 设置点击搜索按键后的操作（通过回调接口）
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

## 5. Complete Demo
[Carson_Ho Github：SearchLayout](https://github.com/Carson-Ho/Search_Layout)

![示意图](http://upload-images.jianshu.io/upload_images/944365-54bff60f16c6946d.gif?imageMogr2/auto-orient/strip)




## 6.  Source code analysis
[手把手教你写一个完整的自定义View](http://www.jianshu.com/p/590f00025de3)



## 7.  LICENSE
SearchLayout is available under the MIT license.



## 8. Contribute
Before you open an issue or create a pull request, please read [Contributing Guide](https://github.com/Carson-Ho/DIY_View/blob/master/CONTRIBUTING.md) first.



## 9. Release
2017-08-11 v1.0.0 ：add base function



# About the author
- ID：Carson_Ho
- 简介：CSDN签约作者、简书推荐作者、稀土掘金专栏作者
- E - mail：[carson.ho@foxmail.com](mailto:carson.ho@foxmail.com)
- Github：[https://github.com/Carson-Ho](https://github.com/Carson-Ho)
- CSDN：[http://blog.csdn.net/carson_ho](http://blog.csdn.net/carson_ho)
- 简书：[http://www.jianshu.com/u/383970bef0a0](http://www.jianshu.com/u/383970bef0a0)
- 稀土掘金：[https://juejin.im/user/58d4d9781b69e6006ba65edc](https://juejin.im/user/58d4d9781b69e6006ba65edc)
