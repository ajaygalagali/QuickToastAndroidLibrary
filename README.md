[![](https://jitpack.io/v/ajaygalagali/QuickToastAndroidLibrary.svg)](https://jitpack.io/#ajaygalagali/QuickToastAndroidLibrary)

This is a simple android toast library which makes your code shorter.

Example :   
    For Short Toast -  
```  
QuickToast.Short(this,"This is a short Toast");  
```  
  
 For Long Toast -
 ```
QuickToast.Long(this,"This is a long Toast");  
`````

### How to use this library in your project?
#### Step 1: Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```css
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```


#### Step 2: Add the dependency
```css
dependencies {
	        implementation 'com.github.ajaygalagali:QuickToastAndroidLibrary:0.1'
	}
```