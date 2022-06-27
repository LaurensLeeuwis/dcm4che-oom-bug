package test;

import java.io.IOException;
import java.io.InputStream;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.io.DicomInputStream;

public class Test {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Test.class.getResourceAsStream("/SequenceWithUndefinedLengthNotConvertibleToDefinedLength.dcm");
        DicomInputStream dicomInputStream = new DicomInputStream(inputStream);
        Attributes attributes = dicomInputStream.readDatasetUntilPixelData();
        System.out.println(attributes);
    }
}
