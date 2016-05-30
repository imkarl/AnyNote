# 技术文档

## 整体架构

<pre>
AnyNote
    |- app              主工程（APP程序入口）
    |- services         服务（提供业务支持，包括数据存储等）
    |- third party      第三方（提供第三方支持，包括控件、业务、类库等）
</pre>

### app（Java）

- 使用Reactivex解决多线程问题

### services（Kotlin+Java）

- 使用Reactivex解决多线程问题
- 使用Retrofit处理网络请求

