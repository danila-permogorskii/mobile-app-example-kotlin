package burrows.apps.example.gif.data.rest.model

import com.google.gson.annotations.SerializedName

/**
 * No args constructor for use in serialization.
 *
 * @author [Jared Burrows](mailto:jaredsburrows@gmail.com)
 */
class Gif {
  @SerializedName("url") var url: String? = null
  @SerializedName("preview") var preview: String? = null

  fun url(): String? {
    return url
  }

  fun preview(): String? {
    return preview
  }
}
