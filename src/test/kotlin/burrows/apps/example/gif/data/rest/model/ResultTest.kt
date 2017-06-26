package burrows.apps.example.gif.data.rest.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import test.TestBase

/**
 * @author [Jared Burrows](mailto:jaredsburrows@gmail.com)
 */
class ResultTest : TestBase() {
  private val testMedias = ArrayList<Media>()
  private var sut = Result().apply { media = testMedias; title = TestBase.STRING_UNIQUE }

  @Test fun testGetMedia() {
    // Assert
    assertThat(sut.media()).isEqualTo(testMedias)
  }

  @Test fun testGetTitle() {
    // Assert
    assertThat(sut.title()).isEqualTo(TestBase.STRING_UNIQUE)
  }
}
