import boto3

# add your ARNs here :
KinesisVideoStreamARN = "arn:aws:kinesisvideo:us-east-1:896789520475:stream/DemoStreamQ/1695201914698"
SNSTopicARN = "arn:aws:sns:us-east-1:896789520475:sve-stream-sns"

# add your bucket and stream processor names here:
S3BucketName = "demo-stream-bucket-qcv"
StreamProcessorName = "demo-stream-processorq"

client = boto3.client('rekognition')

response = client.create_stream_processor(
    Input={
        'KinesisVideoStream': {
            'Arn': KinesisVideoStreamARN
        }
    },
    Output={
        'S3Destination': {
            'Bucket': S3BucketName
        }
    },
    Name= StreamProcessorName,
        Settings = {'ConnectedHome': {
            'Labels': ["PERSON", "PET", "PACKAGE","ALL"],
            'MinConfidence': 90
        }
        },

    RoleArn='arn:aws:iam::896789520475:role/sve-template-rRekognitionRole-dYvsA4suoA9f',
    NotificationChannel={
        'SNSTopicArn': SNSTopicARN
    }
)
print(response)
