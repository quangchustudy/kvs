# RUNBOOK

## I. Install KVS SDK
[insall link - macOS](/lab01/README.md)
[sdk link](/amazon-kinesis-video-streams-producer-sdk-cpp/README.md)

Note: For MacOS - pls follow the ```install link - macOS``` above

## II. Architect
[arch drawio](/rekognition-streaming-video-events/arch/)

## III. CloudFormation deploy note
1. Deploy on ```us-east-1```. Because there a python layer in the CF script that need to download from us-east-1 s3. If we use another region then we will face an ```error``` that ```access denied```
2. Create ```KVS``` manually on AWS management console and get the ```arn``` for the next steps
3. ```start_stream_processor.py``` and ```cr_stream_processor.py``` for individual tasks are ```create rekognition processor stream``` and ```start rekognition processor stream```. So we should use it for understanding how to code.
4. using script ```sve_simulator.py``` in the path ```amazon-kinesis-video-streams-producer-sdk-cpp/build/sve_simulator.py``` to run in the next steps
***Note***: Why, I copied the sve_simulator.py script to this folder because ```build``` folder containing the c++ script ```kvs_gstreamer_file_uploader_sample``` to run to upload video
5. Run the script as following
Delete the processor stream first to make sure only one processor stream binding to one ksv. If not you will encounter a limit error
```bash
cd amazon-kinesis-video-streams-producer-sdk-cpp/build
aws rekognition delete-stream-processor --name DemoStreamSveProcessorQ
```
***Note***: the name ```DemoStreamSveProcessorQ``` is the name that you will use in the ```sve_simulator.py``` file 

Run the file
```bash
python3 sve_profile_report.py
```

## IV. Code changes:
Using the CF output values to hardcode the ```sve_simulator.py```
```python
sns_topic_arn = 
s3_bucket_name = 
rekognition_role_arn = 
```
```
kvs_stream_arn=<ARN of kinesis video stream which is created by manually on management console>
kvs_stream_name=<name of kinesis video stream (kvs)>

