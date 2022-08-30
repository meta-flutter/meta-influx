DESCRIPTION = "github.com/influxdata/influxdb"

GO_IMPORT = "github.com/influxdata/influxdb"

inherit go

SRC_URI = "git://github.com/influxdata/influxdb;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "9d83e4626d2f190bbd421baea1673e666e759221"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=ba8146ad9cc2a128209983265136e06a"

FILES:${PN} += "${GOBIN_FINAL}/*"

DEPENDS +="\
    collectd\
    go-collectd.org\
    github.com-bmizerany-pat\
    github.com-boltdb-bolt\
    github.com-burntsushi-toml\
    github.com-cespare-xxhash\
    github.com-clarkduvall-hyperloglog\
    github.com-davecgh-go-spew\
    github.com-dgrijalva-jwt-go\
    github.com-dgryski-go-bits\
    github.com-dgryski-go-bitstream\
    github.com-gogo-protobuf\
    github.com-golang-snappy\
    github.com-influxdata-usage-client\
    github.com-jwilder-encoding\
    github.com-paulbellamy-ratecounter\
    github.com-peterh-liner\
    github.com-retailnext-hllpp\
    github.com-sirupsen-logrus\
    github.com-uber-common-bark\
    github.com-uber-go-atomic\
    github.com-uber-go-zap\
    golang.org-x-crypto\
    github.com-rakyll-statik\
"

RDEPENDS:${PN}-staticdev += "\
                             bash \
                             python \
                             "