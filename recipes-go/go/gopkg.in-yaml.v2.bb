DESCRIPTION = "gopkg.in/yaml.v2"

GO_IMPORT = "gopkg.in/yaml.v2"

inherit go

SRC_URI = "git://gopkg.in/yaml.v2;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "cd8b52f8269e0feb286dfeef29f8fe4d5b397e0b" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6964839e54f4fefcdae13f22b92d0fbb"

FILES:${PN} += "${GOBIN_FINAL}/*"
