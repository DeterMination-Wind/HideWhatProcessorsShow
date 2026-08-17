# Hide What Processors Show

[中文](README_zh.md) | [English](README.md)

A small Mindustry client mod that lets you hide visual output created by world processors without changing the map or its logic.

## Features

- Press `F9` to show or hide effects emitted by world processor `effect` instructions.
- Press `F10` to show or hide dynamic markers stored in `state.markers`.
- Rebind both controls under **Settings > Controls > Processor visibility**.
- Each switch is independent and displays a short status message when changed.

The filtering is intentionally narrow:

- Normal combat and environmental effects remain visible.
- Objective markers attached to map objectives remain visible.
- Marker definitions, processor instructions, and map data are never deleted or modified.

## Compatibility

- Mindustry `v154` or newer
- Vanilla Mindustry and MindustryX
- Desktop and Android through one universal JAR

## Installation

Download `HideWhatProcessorsShow.jar` from the latest GitHub Release and import it from Mindustry's **Mods** menu, or place it in the game's `mods/` directory.

The mod is marked as hidden in its descriptor, so it does not add a content entry to the in-game mod browser. Its keybinds remain available in the controls settings.

## Build

Requires JDK 8 or newer, Gradle, and an Android SDK containing D8 plus a platform `android.jar`.

```shell
gradle clean deploy
```

Build outputs:

- `dist/HideWhatProcessorsShow.jar` - universal desktop and Android mod JAR
- `dist/HideWhatProcessorsShow.zip` - release JAR with English and Chinese documentation

Set `ANDROID_SDK_ROOT` or `ANDROID_HOME` when the Android tools are not discoverable automatically. You can also set `D8_PATH` directly to `d8` or `d8.bat`.
