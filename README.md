Simple Analog Clock
-----

Simple analog clock with beautiful interface and a feature to add data inside it

![image](https://raw.githubusercontent.com/huteri/analogclock/fc176c8cb3541e8f2362862e6a4e26da7345d71f/screenshots/Screenshot_1521184376.png)


Setup
-----


Add this to your root `build.gradle` file

```gradle
allprojects {
	repositories {
        maven { url "https://jitpack.io" }
    }
}
```

Then, add the library to your module `build.gradle`
```gradle
dependencies {
    implementation 'com.github.huteri:analogclock:0.0.1'
}
```

Usage
------

Add the view in xml 

```
<me.huteri.analogclock.AnalogClockView
        android:id="@+id/analogClockView"
        android:layout_width="350dp"
        android:layout_height="350dp"
        android:layout_centerHorizontal="true"
        android:padding="24dp" />
```

See [`MainActivity.java`](https://github.com/huteri/analogclock/blob/master/sample/src/main/java/me/huteri/arcview/MainActivity.java) for more details



License
-------

    Copyright 2018 Huteri Manza

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
