# KINESIS VIDEO STREAM

###Install SDK
[amazon kinesis video streams producer sdk cpp](https://github.com/awslabs/amazon-kinesis-video-streams-producer-sdk-cpp)

**Clone sdk**
```bash
git clone https://github.com/awslabs/amazon-kinesis-video-streams-producer-sdk-cpp.git
```

**Configure**
```bash
mkdir -p amazon-kinesis-video-streams-producer-sdk-cpp/build
cd amazon-kinesis-video-streams-producer-sdk-cpp/build
```

**Install libs**
Note: You will also need to install pkg-config, CMake, m4 and a build enviroment. If you are building the GStreamer plugin you will also need GStreamer and GStreamer (Development Libraries).
MacOS
```bash
brew install pkg-config openssl cmake gstreamer gst-plugins-base gst-plugins-good gst-plugins-bad gst-plugins-ugly log4cplus gst-libav
```

On Ubuntu and Raspberry Pi OS
```bash
sudo apt-get install libssl-dev libcurl4-openssl-dev liblog4cplus-dev libgstreamer1.0-dev libgstreamer-plugins-base1.0-dev gstreamer1.0-plugins-base-apps gstreamer1.0-plugins-bad gstreamer1.0-plugins-good gstreamer1.0-plugins-ugly gstreamer1.0-tools
```

**Run configure**
Default
```bash
cd amazon-kinesis-video-streams-producer-sdk-cpp/build
cmake .. 
```

GStreamer and JNI is NOT built by default, if you wish to build both you MUST execute 
```bash
cmake .. -DBUILD_GSTREAMER_PLUGIN=ON -DBUILD_JNI=TRUE
```

**Compiling**
After running cmake, in the same build directory run make:
```bash
make
```
On Windows you should run ***nmake*** instead of make

In your build directory you will now have shared objects for all the targets you have sele
**Installing the library**
If the library needs to be installed, run ```make install```. This will install in default directory based on system. To install in another directory, run ```cmake``` with the ```-DCMAKE_INSTALL_PREFIX``` option with the desired directory before running ```make install```

<hr></hr>

###Check all device after install sdk


<hr></hr>

###Run on MAC
[macOS-client](https://github.com/awslabs/amazon-kinesis-video-streams-producer-sdk-cpp/blob/master/docs/macos.md)

```bash
gst-launch-1.0 -v avfvideosrc ! videoconvert ! vtenc_h264_hw allow-frame-reordering=FALSE realtime=TRUE max-keyframe-interval=45 ! kvssink name=sink stream-name="your_stream_name"  access-key="your_access_key" secret-key="your_secret_key" aws-region="your_aws_region" osxaudiosrc ! audioconvert ! avenc_aac ! queue ! sink.
```

**Log in AWS management console**
view media playback or using media viewer as link as below
[media viewer](https://aws-samples.github.io/amazon-kinesis-video-streams-media-viewer/)