package com.aitorvs.autoparcel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

/**
 * An annotation to indicate the auto-parcel that the annotated class needs to be {@link android.os.Parcelable}
 *
 * <pre>
 * <code>
 * {@literal @}AutoParcel public abstract class Foo  {...}
 * </code>
 * </pre>
 */
@Target(ElementType.TYPE) // on class level
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoParcel {
}
