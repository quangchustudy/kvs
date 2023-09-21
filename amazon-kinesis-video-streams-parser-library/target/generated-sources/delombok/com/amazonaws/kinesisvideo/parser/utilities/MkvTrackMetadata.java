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
package com.amazonaws.kinesisvideo.parser.utilities;

import com.amazonaws.kinesisvideo.parser.mkv.MkvElement;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/**
 * Class that captures the meta-data for a particular track in the mkv response.
 */
public class MkvTrackMetadata {
    private BigInteger trackNumber;
    private Optional<BigInteger> trackUID;
    private String trackName;
    private String codecId;
    private String codecName;
    private ByteBuffer codecPrivateData;
    // Video track specific
    private Optional<BigInteger> pixelWidth;
    private Optional<BigInteger> pixelHeight;
    // Audio track specific
    private Optional<Double> samplingFrequency;
    private Optional<BigInteger> channels;
    private Optional<BigInteger> bitDepth;
    private List<MkvElement> allElementsInTrack;

    @SuppressWarnings("all")
    private static Optional<BigInteger> $default$trackUID() {
        return Optional.empty();
    }

    @SuppressWarnings("all")
    private static String $default$trackName() {
        return "";
    }

    @SuppressWarnings("all")
    private static String $default$codecId() {
        return "";
    }

    @SuppressWarnings("all")
    private static String $default$codecName() {
        return "";
    }

    @SuppressWarnings("all")
    private static Optional<BigInteger> $default$pixelWidth() {
        return Optional.empty();
    }

    @SuppressWarnings("all")
    private static Optional<BigInteger> $default$pixelHeight() {
        return Optional.empty();
    }

    @SuppressWarnings("all")
    private static Optional<Double> $default$samplingFrequency() {
        return Optional.empty();
    }

    @SuppressWarnings("all")
    private static Optional<BigInteger> $default$channels() {
        return Optional.empty();
    }

    @SuppressWarnings("all")
    private static Optional<BigInteger> $default$bitDepth() {
        return Optional.empty();
    }


    @SuppressWarnings("all")
    public static class MkvTrackMetadataBuilder {
        @SuppressWarnings("all")
        private BigInteger trackNumber;
        @SuppressWarnings("all")
        private boolean trackUID$set;
        @SuppressWarnings("all")
        private Optional<BigInteger> trackUID$value;
        @SuppressWarnings("all")
        private boolean trackName$set;
        @SuppressWarnings("all")
        private String trackName$value;
        @SuppressWarnings("all")
        private boolean codecId$set;
        @SuppressWarnings("all")
        private String codecId$value;
        @SuppressWarnings("all")
        private boolean codecName$set;
        @SuppressWarnings("all")
        private String codecName$value;
        @SuppressWarnings("all")
        private ByteBuffer codecPrivateData;
        @SuppressWarnings("all")
        private boolean pixelWidth$set;
        @SuppressWarnings("all")
        private Optional<BigInteger> pixelWidth$value;
        @SuppressWarnings("all")
        private boolean pixelHeight$set;
        @SuppressWarnings("all")
        private Optional<BigInteger> pixelHeight$value;
        @SuppressWarnings("all")
        private boolean samplingFrequency$set;
        @SuppressWarnings("all")
        private Optional<Double> samplingFrequency$value;
        @SuppressWarnings("all")
        private boolean channels$set;
        @SuppressWarnings("all")
        private Optional<BigInteger> channels$value;
        @SuppressWarnings("all")
        private boolean bitDepth$set;
        @SuppressWarnings("all")
        private Optional<BigInteger> bitDepth$value;
        @SuppressWarnings("all")
        private List<MkvElement> allElementsInTrack;

        @SuppressWarnings("all")
        MkvTrackMetadataBuilder() {
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder trackNumber(final BigInteger trackNumber) {
            this.trackNumber = trackNumber;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder trackUID(final Optional<BigInteger> trackUID) {
            this.trackUID$value = trackUID;
            trackUID$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder trackName(final String trackName) {
            this.trackName$value = trackName;
            trackName$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder codecId(final String codecId) {
            this.codecId$value = codecId;
            codecId$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder codecName(final String codecName) {
            this.codecName$value = codecName;
            codecName$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder codecPrivateData(final ByteBuffer codecPrivateData) {
            this.codecPrivateData = codecPrivateData;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder pixelWidth(final Optional<BigInteger> pixelWidth) {
            this.pixelWidth$value = pixelWidth;
            pixelWidth$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder pixelHeight(final Optional<BigInteger> pixelHeight) {
            this.pixelHeight$value = pixelHeight;
            pixelHeight$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder samplingFrequency(final Optional<Double> samplingFrequency) {
            this.samplingFrequency$value = samplingFrequency;
            samplingFrequency$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder channels(final Optional<BigInteger> channels) {
            this.channels$value = channels;
            channels$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder bitDepth(final Optional<BigInteger> bitDepth) {
            this.bitDepth$value = bitDepth;
            bitDepth$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @SuppressWarnings("all")
        public MkvTrackMetadata.MkvTrackMetadataBuilder allElementsInTrack(final List<MkvElement> allElementsInTrack) {
            this.allElementsInTrack = allElementsInTrack;
            return this;
        }

        @SuppressWarnings("all")
        public MkvTrackMetadata build() {
            Optional<BigInteger> trackUID$value = this.trackUID$value;
            if (!this.trackUID$set) trackUID$value = MkvTrackMetadata.$default$trackUID();
            String trackName$value = this.trackName$value;
            if (!this.trackName$set) trackName$value = MkvTrackMetadata.$default$trackName();
            String codecId$value = this.codecId$value;
            if (!this.codecId$set) codecId$value = MkvTrackMetadata.$default$codecId();
            String codecName$value = this.codecName$value;
            if (!this.codecName$set) codecName$value = MkvTrackMetadata.$default$codecName();
            Optional<BigInteger> pixelWidth$value = this.pixelWidth$value;
            if (!this.pixelWidth$set) pixelWidth$value = MkvTrackMetadata.$default$pixelWidth();
            Optional<BigInteger> pixelHeight$value = this.pixelHeight$value;
            if (!this.pixelHeight$set) pixelHeight$value = MkvTrackMetadata.$default$pixelHeight();
            Optional<Double> samplingFrequency$value = this.samplingFrequency$value;
            if (!this.samplingFrequency$set) samplingFrequency$value = MkvTrackMetadata.$default$samplingFrequency();
            Optional<BigInteger> channels$value = this.channels$value;
            if (!this.channels$set) channels$value = MkvTrackMetadata.$default$channels();
            Optional<BigInteger> bitDepth$value = this.bitDepth$value;
            if (!this.bitDepth$set) bitDepth$value = MkvTrackMetadata.$default$bitDepth();
            return new MkvTrackMetadata(this.trackNumber, trackUID$value, trackName$value, codecId$value, codecName$value, this.codecPrivateData, pixelWidth$value, pixelHeight$value, samplingFrequency$value, channels$value, bitDepth$value, this.allElementsInTrack);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "MkvTrackMetadata.MkvTrackMetadataBuilder(trackNumber=" + this.trackNumber + ", trackUID$value=" + this.trackUID$value + ", trackName$value=" + this.trackName$value + ", codecId$value=" + this.codecId$value + ", codecName$value=" + this.codecName$value + ", codecPrivateData=" + this.codecPrivateData + ", pixelWidth$value=" + this.pixelWidth$value + ", pixelHeight$value=" + this.pixelHeight$value + ", samplingFrequency$value=" + this.samplingFrequency$value + ", channels$value=" + this.channels$value + ", bitDepth$value=" + this.bitDepth$value + ", allElementsInTrack=" + this.allElementsInTrack + ")";
        }
    }

    @SuppressWarnings("all")
    public static MkvTrackMetadata.MkvTrackMetadataBuilder builder() {
        return new MkvTrackMetadata.MkvTrackMetadataBuilder();
    }

    @SuppressWarnings("all")
    private MkvTrackMetadata(final BigInteger trackNumber, final Optional<BigInteger> trackUID, final String trackName, final String codecId, final String codecName, final ByteBuffer codecPrivateData, final Optional<BigInteger> pixelWidth, final Optional<BigInteger> pixelHeight, final Optional<Double> samplingFrequency, final Optional<BigInteger> channels, final Optional<BigInteger> bitDepth, final List<MkvElement> allElementsInTrack) {
        this.trackNumber = trackNumber;
        this.trackUID = trackUID;
        this.trackName = trackName;
        this.codecId = codecId;
        this.codecName = codecName;
        this.codecPrivateData = codecPrivateData;
        this.pixelWidth = pixelWidth;
        this.pixelHeight = pixelHeight;
        this.samplingFrequency = samplingFrequency;
        this.channels = channels;
        this.bitDepth = bitDepth;
        this.allElementsInTrack = allElementsInTrack;
    }

    @SuppressWarnings("all")
    public BigInteger getTrackNumber() {
        return this.trackNumber;
    }

    @SuppressWarnings("all")
    public Optional<BigInteger> getTrackUID() {
        return this.trackUID;
    }

    @SuppressWarnings("all")
    public String getTrackName() {
        return this.trackName;
    }

    @SuppressWarnings("all")
    public String getCodecId() {
        return this.codecId;
    }

    @SuppressWarnings("all")
    public String getCodecName() {
        return this.codecName;
    }

    @SuppressWarnings("all")
    public ByteBuffer getCodecPrivateData() {
        return this.codecPrivateData;
    }

    @SuppressWarnings("all")
    public Optional<BigInteger> getPixelWidth() {
        return this.pixelWidth;
    }

    @SuppressWarnings("all")
    public Optional<BigInteger> getPixelHeight() {
        return this.pixelHeight;
    }

    @SuppressWarnings("all")
    public Optional<Double> getSamplingFrequency() {
        return this.samplingFrequency;
    }

    @SuppressWarnings("all")
    public Optional<BigInteger> getChannels() {
        return this.channels;
    }

    @SuppressWarnings("all")
    public Optional<BigInteger> getBitDepth() {
        return this.bitDepth;
    }

    @SuppressWarnings("all")
    public List<MkvElement> getAllElementsInTrack() {
        return this.allElementsInTrack;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MkvTrackMetadata(trackNumber=" + this.getTrackNumber() + ", trackUID=" + this.getTrackUID() + ", trackName=" + this.getTrackName() + ", codecId=" + this.getCodecId() + ", codecName=" + this.getCodecName() + ", pixelWidth=" + this.getPixelWidth() + ", pixelHeight=" + this.getPixelHeight() + ", samplingFrequency=" + this.getSamplingFrequency() + ", channels=" + this.getChannels() + ", bitDepth=" + this.getBitDepth() + ")";
    }
}
