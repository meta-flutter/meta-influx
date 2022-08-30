DESCRIPTION = "github.com/streadway/amqp"

GO_IMPORT = "github.com/streadway/amqp"

inherit go

SRC_URI = "git://github.com/streadway/amqp;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "63795daa9a446c920826655f26ba31c81c860fd6" 
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=29358571796140f6172846eac9be80d2"

FILES:${PN} += "${GOBIN_FINAL}/*"
