// Generated by delombok at Thu Sep 21 09:23:35 ICT 2023
/*
Copyright 2017-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License"). 
You may not use this file except in compliance with the License. 
A copy of the License is located at

   http://aws.amazon.com/apache2.0/

or in the "license" file accompanying this file. 
This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and limitations under the License.
*/
package com.amazonaws.kinesisvideo.parser.rekognition.pojo;

import java.util.ArrayList;
import java.util.List;

public class RekognizedOutput {
    private String fragmentNumber;
    private Double frameOffsetInSeconds;
    private Double serverTimestamp;
    private Double producerTimestamp;
    private String faceId;
    private double detectedTime;
    private List<FaceSearchOutput> faceSearchOutputs;

    public void addFaceSearchOutput(FaceSearchOutput faceSearchOutput) {
        this.faceSearchOutputs.add(faceSearchOutput);
    }


    public static class FaceSearchOutput {
        private DetectedFace detectedFace;
        private List<MatchedFace> matchedFaceList;

        @SuppressWarnings("all")
        private static List<MatchedFace> $default$matchedFaceList() {
            return new ArrayList<>();
        }

        @SuppressWarnings("all")
        FaceSearchOutput(final DetectedFace detectedFace, final List<MatchedFace> matchedFaceList) {
            this.detectedFace = detectedFace;
            this.matchedFaceList = matchedFaceList;
        }


        @SuppressWarnings("all")
        public static class FaceSearchOutputBuilder {
            @SuppressWarnings("all")
            private DetectedFace detectedFace;
            @SuppressWarnings("all")
            private boolean matchedFaceList$set;
            @SuppressWarnings("all")
            private List<MatchedFace> matchedFaceList$value;

            @SuppressWarnings("all")
            FaceSearchOutputBuilder() {
            }

            /**
             * @return {@code this}.
             */
            @SuppressWarnings("all")
            public RekognizedOutput.FaceSearchOutput.FaceSearchOutputBuilder detectedFace(final DetectedFace detectedFace) {
                this.detectedFace = detectedFace;
                return this;
            }

            /**
             * @return {@code this}.
             */
            @SuppressWarnings("all")
            public RekognizedOutput.FaceSearchOutput.FaceSearchOutputBuilder matchedFaceList(final List<MatchedFace> matchedFaceList) {
                this.matchedFaceList$value = matchedFaceList;
                matchedFaceList$set = true;
                return this;
            }

            @SuppressWarnings("all")
            public RekognizedOutput.FaceSearchOutput build() {
                List<MatchedFace> matchedFaceList$value = this.matchedFaceList$value;
                if (!this.matchedFaceList$set) matchedFaceList$value = FaceSearchOutput.$default$matchedFaceList();
                return new RekognizedOutput.FaceSearchOutput(this.detectedFace, matchedFaceList$value);
            }

            @Override
            @SuppressWarnings("all")
            public String toString() {
                return "RekognizedOutput.FaceSearchOutput.FaceSearchOutputBuilder(detectedFace=" + this.detectedFace + ", matchedFaceList$value=" + this.matchedFaceList$value + ")";
            }
        }

        @SuppressWarnings("all")
        public static RekognizedOutput.FaceSearchOutput.FaceSearchOutputBuilder builder() {
            return new RekognizedOutput.FaceSearchOutput.FaceSearchOutputBuilder();
        }

        @SuppressWarnings("all")
        public DetectedFace getDetectedFace() {
            return this.detectedFace;
        }

        @SuppressWarnings("all")
        public List<MatchedFace> getMatchedFaceList() {
            return this.matchedFaceList;
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "RekognizedOutput.FaceSearchOutput(detectedFace=" + this.getDetectedFace() + ", matchedFaceList=" + this.getMatchedFaceList() + ")";
        }
    }

    @SuppressWarnings("all")
    private static List<FaceSearchOutput> $default$faceSearchOutputs() {
        return new ArrayList<>();
    }

    @SuppressWarnings("all")
    RekognizedOutput(final String fragmentNumber, final Double frameOffsetInSeconds, final Double serverTimestamp, final Double producerTimestamp, final String faceId, final double detectedTime, final List<FaceSearchOutput> faceSearchOutputs) {
        this.fragmentNumber = fragmentNumber;
        this.frameOffsetInSeconds = frameOffsetInSeconds;
        this.serverTimestamp = serverTimestamp;
        this.producerTimestamp = producerTimestamp;
        this.faceId = faceId;
        this.detectedTime = detectedTime;
        this.faceSearchOutputs = faceSearchOutputs;
    }


    @SuppressWarnings("all")
    public static class RekognizedOutputBuilder {
        @SuppressWarnings("all")
        private String fragmentNumber;
        @SuppressWarnings("all")
        private Double frameOffsetInSeconds;
        @SuppressWarnings("all")
        private Double serverTimestamp;
        @SuppressWarnings("all")
        private Double producerTimestamp;
        @SuppressWarnings("all")
        private String faceId;
        @SuppressWarnings("all")
        private double detectedTime;
        @SuppressWarnings("all")
        private boolean faceSearchOutputs$set;
        @SuppressWarnings("all")
        private List<FaceSearchOutput> faceSearchOutputs$value;

        @SuppressWarnings("all")
        RekognizedOutputBuilder() {
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public RekognizedOutput.RekognizedOutputBuilder fragmentNumber(final String fragmentNumber) {
            this.fragmentNumber = fragmentNumber;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public RekognizedOutput.RekognizedOutputBuilder frameOffsetInSeconds(final Double frameOffsetInSeconds) {
            this.frameOffsetInSeconds = frameOffsetInSeconds;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public RekognizedOutput.RekognizedOutputBuilder serverTimestamp(final Double serverTimestamp) {
            this.serverTimestamp = serverTimestamp;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public RekognizedOutput.RekognizedOutputBuilder producerTimestamp(final Double producerTimestamp) {
            this.producerTimestamp = producerTimestamp;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public RekognizedOutput.RekognizedOutputBuilder faceId(final String faceId) {
            this.faceId = faceId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public RekognizedOutput.RekognizedOutputBuilder detectedTime(final double detectedTime) {
            this.detectedTime = detectedTime;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public RekognizedOutput.RekognizedOutputBuilder faceSearchOutputs(final List<FaceSearchOutput> faceSearchOutputs) {
            this.faceSearchOutputs$value = faceSearchOutputs;
            faceSearchOutputs$set = true;
            return this;
        }

        @SuppressWarnings("all")
        public RekognizedOutput build() {
            List<FaceSearchOutput> faceSearchOutputs$value = this.faceSearchOutputs$value;
            if (!this.faceSearchOutputs$set) faceSearchOutputs$value = RekognizedOutput.$default$faceSearchOutputs();
            return new RekognizedOutput(this.fragmentNumber, this.frameOffsetInSeconds, this.serverTimestamp, this.producerTimestamp, this.faceId, this.detectedTime, faceSearchOutputs$value);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "RekognizedOutput.RekognizedOutputBuilder(fragmentNumber=" + this.fragmentNumber + ", frameOffsetInSeconds=" + this.frameOffsetInSeconds + ", serverTimestamp=" + this.serverTimestamp + ", producerTimestamp=" + this.producerTimestamp + ", faceId=" + this.faceId + ", detectedTime=" + this.detectedTime + ", faceSearchOutputs$value=" + this.faceSearchOutputs$value + ")";
        }
    }

    @SuppressWarnings("all")
    public static RekognizedOutput.RekognizedOutputBuilder builder() {
        return new RekognizedOutput.RekognizedOutputBuilder();
    }

    @SuppressWarnings("all")
    public String getFragmentNumber() {
        return this.fragmentNumber;
    }

    @SuppressWarnings("all")
    public Double getFrameOffsetInSeconds() {
        return this.frameOffsetInSeconds;
    }

    @SuppressWarnings("all")
    public Double getServerTimestamp() {
        return this.serverTimestamp;
    }

    @SuppressWarnings("all")
    public Double getProducerTimestamp() {
        return this.producerTimestamp;
    }

    @SuppressWarnings("all")
    public String getFaceId() {
        return this.faceId;
    }

    @SuppressWarnings("all")
    public double getDetectedTime() {
        return this.detectedTime;
    }

    @SuppressWarnings("all")
    public List<FaceSearchOutput> getFaceSearchOutputs() {
        return this.faceSearchOutputs;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "RekognizedOutput(fragmentNumber=" + this.getFragmentNumber() + ", frameOffsetInSeconds=" + this.getFrameOffsetInSeconds() + ", serverTimestamp=" + this.getServerTimestamp() + ", producerTimestamp=" + this.getProducerTimestamp() + ", faceId=" + this.getFaceId() + ", detectedTime=" + this.getDetectedTime() + ", faceSearchOutputs=" + this.getFaceSearchOutputs() + ")";
    }

    @SuppressWarnings("all")
    public void setFaceId(final String faceId) {
        this.faceId = faceId;
    }
}
