# Hide What Processors Show

[中文](README_zh.md) | [English](README.md)

一个小型 Mindustry 客户端模组，用于隐藏世界处理器产生的视觉内容，不会修改地图或地图逻辑。

## 功能

- 按 `F9` 显示或隐藏世界处理器 `effect` 指令产生的特效。
- 按 `F10` 显示或隐藏存放在 `state.markers` 中的动态 Marker。
- 可在 **设置 > 控制 > 处理器视觉** 中重新绑定两个快捷键。
- 两个开关相互独立，切换时会显示简短的状态提示。

过滤范围经过刻意限制：

- 普通战斗特效和环境特效保持可见。
- 地图目标自带的目标 Marker 保持可见。
- 不会删除或修改 Marker 定义、处理器指令及地图数据。

## 兼容性

- Mindustry `v154` 或更高版本
- 原版 Mindustry 与 MindustryX
- 桌面端与 Android 共用一个通用 JAR

## 安装

从最新 GitHub Release 下载 `HideWhatProcessorsShow.jar`，在 Mindustry 的 **模组** 页面导入，或将文件放入游戏的 `mods/` 目录。

本模组在描述文件中设置了 `hidden: true`，因此不会在游戏内模组浏览器中添加内容入口；快捷键仍可在控制设置中找到。

## 构建

需要 JDK 8 或更高版本、Gradle，以及包含 D8 和平台 `android.jar` 的 Android SDK。

```shell
gradle clean deploy
```

构建产物：

- `dist/HideWhatProcessorsShow.jar` - 同时支持桌面端与 Android 的通用模组 JAR
- `dist/HideWhatProcessorsShow.zip` - 包含发布 JAR 及中英文文档的压缩包

如果构建脚本无法自动找到 Android 工具，请设置 `ANDROID_SDK_ROOT` 或 `ANDROID_HOME`；也可以将 `D8_PATH` 直接指向 `d8` 或 `d8.bat`。
