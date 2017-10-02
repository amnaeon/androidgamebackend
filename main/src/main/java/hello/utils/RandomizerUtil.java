package hello.utils;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RandomizerUtil {
    public static String generateToken() {
        return new BigInteger(68, new SecureRandom()).toString(32);

    }
}
