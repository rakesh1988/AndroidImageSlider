# Android Image Slider [![](https://jitpack.io/v/rakesh1988/AndroidImageSlider.svg)](https://jitpack.io/#rakesh1988/AndroidImageSlider)

This is same as the "AndroidImageSlider" from daimajia https://github.com/daimajia/AndroidImageSlider

Differences :
- Removed dependency on nineoldandroids.
- Updated android support library version to 24.2.0 (latest during the compilation)
- Since I am not using nineoldandroids, minSdkVersion is now set to 11

## Usage

```groovy
buildscript {
    repositories {
        maven { url "https://jitpack.io" }
}

dependencies {
    	compile 'com.squareup.picasso:picasso:2.5.2'
    	compile 'com.github.rakesh1988:AndroidImageSlider:v2.0.0@aar'
}
```



## Thanks

- daimajia who built AndroidImageSlider

