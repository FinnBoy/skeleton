package net.awaken.core.linq.operation;

import net.awaken.core.linq.bean.Struct;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @param <Left>
 * @param <Right>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public interface Union<Left, Right> {

    Struct<Left> left();

    Struct<Right> right();

    Union<Left, Right> on(String leftField, String rightField);

    Union<Left, Right> on(byte leftField, byte rightField);

    Union<Left, Right> on(char leftField, char rightField);

    Union<Left, Right> on(short leftField, short rightField);

    Union<Left, Right> on(int leftField, int rightField);

    Union<Left, Right> on(long leftField, long rightField);

    Union<Left, Right> on(float leftField, float rightField);

    Union<Left, Right> on(double leftField, double rightField);

    Union<Left, Right> on(Byte leftField, Byte rightField);

    Union<Left, Right> on(Character leftField, Character rightField);

    Union<Left, Right> on(Short leftField, Short rightField);

    Union<Left, Right> on(Integer leftField, Integer rightField);

    Union<Left, Right> on(Long leftField, Long rightField);

    Union<Left, Right> on(Float leftField, Float rightField);

    Union<Left, Right> on(Double leftField, Double rightField);

    Union<Left, Right> on(BigInteger leftField, BigInteger rightField);

    Union<Left, Right> on(BigDecimal leftField, BigDecimal rightField);

    Union<Left, Right> on(Date leftField, Date rightField);

}
