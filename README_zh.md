# Hide What Processors Show

> 清理处理器带来的画面噪声，不触碰地图和逻辑。

Hide What Processors Show 是一个轻量的 Mindustry 客户端辅助模组。当地图处理器特效和动态标记让战场难以看清时，你可以暂时隐藏这些显示层，而不会修改地图、处理器代码或游戏逻辑。

两种视觉内容可以分别控制，只隐藏当前不需要的部分。它只影响本地客户端，适合多人游戏。

## 兼容性

面向原版 Mindustry 客户端，不需要服务器安装。

## 安装

从最新 GitHub Release 下载 HideWhatProcessorsShow.jar，在游戏的模组页面导入，或放入游戏的 mods 目录。

## 构建

需要 JDK 8 或更高版本、Gradle，以及包含 D8 和平台 android.jar 的 Android SDK。

~~~powershell
gradle clean deploy
~~~
