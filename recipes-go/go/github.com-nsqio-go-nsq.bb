DESCRIPTION = "github.com/nsqio/go-nsq"

GO_IMPORT = "github.com/nsqio/go-nsq"

inherit go

SRC_URI = "git://github.com/nsqio/go-nsq;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "a53d495e81424aaf7a7665a9d32a97715c40e953" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

FILES:${PN} += "${GOBIN_FINAL}/*"


RDEPENDS:${PN}-staticdev += "\
                            bash \
                            "