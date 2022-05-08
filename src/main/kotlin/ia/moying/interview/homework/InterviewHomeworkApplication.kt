package ia.moying.interview.homework

import io.vertx.core.Vertx


class InterviewHomeworkApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val vertx = Vertx.vertx()
            vertx.deployVerticle(MainVerticle())
            log.info("Hello, world!")
        }

        private val log = org.slf4j.LoggerFactory.getLogger(InterviewHomeworkApplication::class.java)
    }

}
