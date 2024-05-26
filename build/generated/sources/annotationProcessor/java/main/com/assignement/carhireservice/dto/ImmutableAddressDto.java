package com.assignement.carhireservice.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AddressDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAddressDto.builder()}.
 */
@Generated(from = "AddressDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableAddressDto implements AddressDto {
  private final String streetNumber;
  private final String streetName;
  private final String streetType;
  private final String suburb;
  private final String state;
  private final String postCode;

  private ImmutableAddressDto(
      String streetNumber,
      String streetName,
      String streetType,
      String suburb,
      String state,
      String postCode) {
    this.streetNumber = streetNumber;
    this.streetName = streetName;
    this.streetType = streetType;
    this.suburb = suburb;
    this.state = state;
    this.postCode = postCode;
  }

  /**
   * @return The value of the {@code streetNumber} attribute
   */
  @JsonProperty("streetNumber")
  @Override
  public String getStreetNumber() {
    return streetNumber;
  }

  /**
   * @return The value of the {@code streetName} attribute
   */
  @JsonProperty("streetName")
  @Override
  public String getStreetName() {
    return streetName;
  }

  /**
   * @return The value of the {@code streetType} attribute
   */
  @JsonProperty("streetType")
  @Override
  public String getStreetType() {
    return streetType;
  }

  /**
   * @return The value of the {@code suburb} attribute
   */
  @JsonProperty("suburb")
  @Override
  public String getSuburb() {
    return suburb;
  }

  /**
   * @return The value of the {@code state} attribute
   */
  @JsonProperty("state")
  @Override
  public String getState() {
    return state;
  }

  /**
   * @return The value of the {@code postCode} attribute
   */
  @JsonProperty("postCode")
  @Override
  public String getPostCode() {
    return postCode;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AddressDto#getStreetNumber() streetNumber} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for streetNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddressDto withStreetNumber(String value) {
    String newValue = Objects.requireNonNull(value, "streetNumber");
    if (this.streetNumber.equals(newValue)) return this;
    return new ImmutableAddressDto(newValue, this.streetName, this.streetType, this.suburb, this.state, this.postCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AddressDto#getStreetName() streetName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for streetName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddressDto withStreetName(String value) {
    String newValue = Objects.requireNonNull(value, "streetName");
    if (this.streetName.equals(newValue)) return this;
    return new ImmutableAddressDto(this.streetNumber, newValue, this.streetType, this.suburb, this.state, this.postCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AddressDto#getStreetType() streetType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for streetType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddressDto withStreetType(String value) {
    String newValue = Objects.requireNonNull(value, "streetType");
    if (this.streetType.equals(newValue)) return this;
    return new ImmutableAddressDto(this.streetNumber, this.streetName, newValue, this.suburb, this.state, this.postCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AddressDto#getSuburb() suburb} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for suburb
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddressDto withSuburb(String value) {
    String newValue = Objects.requireNonNull(value, "suburb");
    if (this.suburb.equals(newValue)) return this;
    return new ImmutableAddressDto(this.streetNumber, this.streetName, this.streetType, newValue, this.state, this.postCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AddressDto#getState() state} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for state
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddressDto withState(String value) {
    String newValue = Objects.requireNonNull(value, "state");
    if (this.state.equals(newValue)) return this;
    return new ImmutableAddressDto(this.streetNumber, this.streetName, this.streetType, this.suburb, newValue, this.postCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AddressDto#getPostCode() postCode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for postCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddressDto withPostCode(String value) {
    String newValue = Objects.requireNonNull(value, "postCode");
    if (this.postCode.equals(newValue)) return this;
    return new ImmutableAddressDto(this.streetNumber, this.streetName, this.streetType, this.suburb, this.state, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAddressDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAddressDto
        && equalTo(0, (ImmutableAddressDto) another);
  }

  private boolean equalTo(int synthetic, ImmutableAddressDto another) {
    return streetNumber.equals(another.streetNumber)
        && streetName.equals(another.streetName)
        && streetType.equals(another.streetType)
        && suburb.equals(another.suburb)
        && state.equals(another.state)
        && postCode.equals(another.postCode);
  }

  /**
   * Computes a hash code from attributes: {@code streetNumber}, {@code streetName}, {@code streetType}, {@code suburb}, {@code state}, {@code postCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + streetNumber.hashCode();
    h += (h << 5) + streetName.hashCode();
    h += (h << 5) + streetType.hashCode();
    h += (h << 5) + suburb.hashCode();
    h += (h << 5) + state.hashCode();
    h += (h << 5) + postCode.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AddressDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AddressDto{"
        + "streetNumber=" + streetNumber
        + ", streetName=" + streetName
        + ", streetType=" + streetType
        + ", suburb=" + suburb
        + ", state=" + state
        + ", postCode=" + postCode
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AddressDto", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AddressDto {
    String streetNumber;
    String streetName;
    String streetType;
    String suburb;
    String state;
    String postCode;
    @JsonProperty("streetNumber")
    public void setStreetNumber(String streetNumber) {
      this.streetNumber = streetNumber;
    }
    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
      this.streetName = streetName;
    }
    @JsonProperty("streetType")
    public void setStreetType(String streetType) {
      this.streetType = streetType;
    }
    @JsonProperty("suburb")
    public void setSuburb(String suburb) {
      this.suburb = suburb;
    }
    @JsonProperty("state")
    public void setState(String state) {
      this.state = state;
    }
    @JsonProperty("postCode")
    public void setPostCode(String postCode) {
      this.postCode = postCode;
    }
    @Override
    public String getStreetNumber() { throw new UnsupportedOperationException(); }
    @Override
    public String getStreetName() { throw new UnsupportedOperationException(); }
    @Override
    public String getStreetType() { throw new UnsupportedOperationException(); }
    @Override
    public String getSuburb() { throw new UnsupportedOperationException(); }
    @Override
    public String getState() { throw new UnsupportedOperationException(); }
    @Override
    public String getPostCode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAddressDto fromJson(Json json) {
    ImmutableAddressDto.Builder builder = ImmutableAddressDto.builder();
    if (json.streetNumber != null) {
      builder.streetNumber(json.streetNumber);
    }
    if (json.streetName != null) {
      builder.streetName(json.streetName);
    }
    if (json.streetType != null) {
      builder.streetType(json.streetType);
    }
    if (json.suburb != null) {
      builder.suburb(json.suburb);
    }
    if (json.state != null) {
      builder.state(json.state);
    }
    if (json.postCode != null) {
      builder.postCode(json.postCode);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AddressDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AddressDto instance
   */
  public static ImmutableAddressDto copyOf(AddressDto instance) {
    if (instance instanceof ImmutableAddressDto) {
      return (ImmutableAddressDto) instance;
    }
    return ImmutableAddressDto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAddressDto ImmutableAddressDto}.
   * <pre>
   * ImmutableAddressDto.builder()
   *    .streetNumber(String) // required {@link AddressDto#getStreetNumber() streetNumber}
   *    .streetName(String) // required {@link AddressDto#getStreetName() streetName}
   *    .streetType(String) // required {@link AddressDto#getStreetType() streetType}
   *    .suburb(String) // required {@link AddressDto#getSuburb() suburb}
   *    .state(String) // required {@link AddressDto#getState() state}
   *    .postCode(String) // required {@link AddressDto#getPostCode() postCode}
   *    .build();
   * </pre>
   * @return A new ImmutableAddressDto builder
   */
  public static ImmutableAddressDto.Builder builder() {
    return new ImmutableAddressDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAddressDto ImmutableAddressDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AddressDto", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_STREET_NUMBER = 0x1L;
    private static final long INIT_BIT_STREET_NAME = 0x2L;
    private static final long INIT_BIT_STREET_TYPE = 0x4L;
    private static final long INIT_BIT_SUBURB = 0x8L;
    private static final long INIT_BIT_STATE = 0x10L;
    private static final long INIT_BIT_POST_CODE = 0x20L;
    private long initBits = 0x3fL;

    private String streetNumber;
    private String streetName;
    private String streetType;
    private String suburb;
    private String state;
    private String postCode;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AddressDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AddressDto instance) {
      Objects.requireNonNull(instance, "instance");
      this.streetNumber(instance.getStreetNumber());
      this.streetName(instance.getStreetName());
      this.streetType(instance.getStreetType());
      this.suburb(instance.getSuburb());
      this.state(instance.getState());
      this.postCode(instance.getPostCode());
      return this;
    }

    /**
     * Initializes the value for the {@link AddressDto#getStreetNumber() streetNumber} attribute.
     * @param streetNumber The value for streetNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("streetNumber")
    public final Builder streetNumber(String streetNumber) {
      this.streetNumber = Objects.requireNonNull(streetNumber, "streetNumber");
      initBits &= ~INIT_BIT_STREET_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link AddressDto#getStreetName() streetName} attribute.
     * @param streetName The value for streetName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("streetName")
    public final Builder streetName(String streetName) {
      this.streetName = Objects.requireNonNull(streetName, "streetName");
      initBits &= ~INIT_BIT_STREET_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AddressDto#getStreetType() streetType} attribute.
     * @param streetType The value for streetType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("streetType")
    public final Builder streetType(String streetType) {
      this.streetType = Objects.requireNonNull(streetType, "streetType");
      initBits &= ~INIT_BIT_STREET_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link AddressDto#getSuburb() suburb} attribute.
     * @param suburb The value for suburb 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("suburb")
    public final Builder suburb(String suburb) {
      this.suburb = Objects.requireNonNull(suburb, "suburb");
      initBits &= ~INIT_BIT_SUBURB;
      return this;
    }

    /**
     * Initializes the value for the {@link AddressDto#getState() state} attribute.
     * @param state The value for state 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("state")
    public final Builder state(String state) {
      this.state = Objects.requireNonNull(state, "state");
      initBits &= ~INIT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the value for the {@link AddressDto#getPostCode() postCode} attribute.
     * @param postCode The value for postCode 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("postCode")
    public final Builder postCode(String postCode) {
      this.postCode = Objects.requireNonNull(postCode, "postCode");
      initBits &= ~INIT_BIT_POST_CODE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAddressDto ImmutableAddressDto}.
     * @return An immutable instance of AddressDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAddressDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAddressDto(streetNumber, streetName, streetType, suburb, state, postCode);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_STREET_NUMBER) != 0) attributes.add("streetNumber");
      if ((initBits & INIT_BIT_STREET_NAME) != 0) attributes.add("streetName");
      if ((initBits & INIT_BIT_STREET_TYPE) != 0) attributes.add("streetType");
      if ((initBits & INIT_BIT_SUBURB) != 0) attributes.add("suburb");
      if ((initBits & INIT_BIT_STATE) != 0) attributes.add("state");
      if ((initBits & INIT_BIT_POST_CODE) != 0) attributes.add("postCode");
      return "Cannot build AddressDto, some of required attributes are not set " + attributes;
    }
  }
}
