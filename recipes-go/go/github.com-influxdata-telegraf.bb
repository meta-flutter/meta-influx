DESCRIPTION = "github.com/influxdata/telegraf"

GO_IMPORT = "github.com/influxdata/telegraf"

inherit go

SRC_URI = "git://github.com/influxdata/telegraf;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "b968759d1015f47bf60de5ec05e762a994692110"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=10a23e7a514f23f0930e1a4254936534"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS +="\
    collectd\
    go-collectd.org\
    github.com-davecgh-go-spew\
    github.com-golang-protobuf\
    github.com-golang-snappy\
    github.com-sirupsen-logrus\
    github.com-docker-docker\
    golang.org-x-crypto\
    golang.org-x-net\
    golang.org-x-text\
"

RDEPENDS_${PN}-staticdev += "bash \
                             python \
                             "