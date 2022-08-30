DESCRIPTION = "github.com/uber-common/bark"

GO_IMPORT = "github.com/uber-common/bark"

inherit go

SRC_URI = "git://github.com/uber-common/bark;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "148dd9dfbd0feb293fc81593a8c10c99877f81bc" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b95027a144fd75630412e36bb068bf5b"

FILES:${PN} += "${GOBIN_FINAL}/*"

DEPENDS +="\
    github.com-sirupsen-logrus \
    github.com-cactus-go-statsd-client \
    github.com-stretchr-testify \
"