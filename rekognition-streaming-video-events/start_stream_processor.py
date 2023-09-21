import boto3
from datetime import datetime

client = boto3.client('rekognition')
start_time = round(datetime.now().timestamp())

response = client.start_stream_processor(
    Name='demo-stream-processorq',
    StartSelector={
        'KVSStreamStartSelector': {
            'ProducerTimestamp': start_time
        }
    },
    StopSelector={
        'MaxDurationInSeconds': 120
    }
)

print(response)
