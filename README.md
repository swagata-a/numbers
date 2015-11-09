# Welcome to base station, the launching pad for your Android projects

### Before you jump in consider the following facts:

- This is a work under experiment. I have tried my best to remove integration issues for you. But you can expect some odd issues crop up from time to time.
- **Never** use the code in this repo *as-is*. Always fork it, change the project package name and start working.
- I have open sourced it within Simpragma. Feel free to add to it. Just send a PR before you add anything.

### What you need

- Android Studio. If you don't have it, [get it from here] [2].
- Git installed at your system. If you are in Windows or Mac, [I recommend SourceTree] [3].
- Some basic knowledge of Android, I am sure you have it. If not, head towards our great tutorials and you will be ready soon.

### Setting up

- [Fork] the repository
- In your new repository change the package name of the project. For Android studio, [this is how it is done] [1].
- Change your app launcher icon.
- Compile, run, and you should be able to see the first screen.
- Post a thank you note on my name ;)

## Tools already configured:

### [Crashlytics] [5]:
We have configured the most used and very lightweight crash reporting system Crashlytics for you. Though it is installed for you, you will need to configure it before it becomes usable.

Below steps will help you to get it running:

- Create a new project and get an application key from Crashlytics. [Follow this tutorial] [4] (only the creating project and getting API key part) to get an API key.
- Head towards AndroidManifest.xml and put this key into the place where you see something like below:
```sh
<meta-data
            android:name="io.fabric.ApiKey"
            android:value="c9738fdd11507f27c02f7a40b964ed64d8650be4" /> <!-- TODO Must change this -->
```

### [Butterknife] [6]

Finally we are here to work on some View Injection. If you are an android developer and know how messy it is to deal with all findViewById statements, you will love this. No hard and fast rule you have to use it, but I have added it. In case you feel like removing it, please do so yourself.

I have put some boilerplate code in SplashScreen.java so that you can see how it is used. A small example as below:
```sh
    @Bind(R.id.text_view)
    TextView title;

    @Bind(R.id.image_logo)
    ImageView imageView;
```
Above lines bind two of the views with the respective refeences in a class. PLaying with them is even easier:

```sh
    ButterKnife.bind(this);
    title.setText("Hello");
    Picasso.with(SplashScreen.this).load("http://i.imgur.com/DvpvklR.png").error(R.mipmap.ic_launcher).into(imageView);
```
hmmm what is Picasso? Hold tight, that is our next tool.

### [Picasso] [7]
Picasso is one of the easiest way to handle Image download and handling all image related operations in Android. Follow the url to get a glance on what it is and what it can do.

### [sl4j] [8]
Your loggig framework is ready and running. All you have to do is get a reference and get going in every class.

### [Gson] [9]
Gson is a Java library that can be used to convert Java Objects into their JSON representation. It can also be used to convert a JSON string to an equivalent Java object.
I have given a very basic example for Gson code in SplashScreen. In case you are looking for more examples, [here you go] [10]!

[1]:http://stackoverflow.com/questions/16804093/android-studio-rename-package
[2]:https://developer.android.com/sdk/index.html
[3]:https://www.sourcetreeapp.com/
[4]:http://blog.danlew.net/2015/02/20/setting-up-a-new-app-in-crashlytics-without-the-plugin/
[5]:https://fabric.io/kits/android/crashlytics/summary
[6]:http://jakewharton.github.io/butterknife/
[7]:http://square.github.io/picasso/
[8]:http://tony19.github.io/logback-android/
[9]:https://sites.google.com/site/gson/gson-user-guide
[10]:http://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
[fork]: https://confluence.atlassian.com/bitbucket/fork-a-repo-compare-code-and-create-a-pull-request-mac-osx-linux-271942986.html