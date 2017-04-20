DESCRIPTION = "github.com/prometheus stuff"

GO_IMPORT = "github.com/prometheus"

inherit go

SRC_URI = "git://github.com/prometheus/client_golang;protocol=https;name=client_golang;destsuffix=${PN}-${PV}/src/${GO_IMPORT}/client_golang \
           git://github.com/prometheus/common;protocol=https;name=common;destsuffix=${PN}-${PV}/src/${GO_IMPORT}/common \
          "
SRCREV_client_golang = "c317fb74746eac4fc65fe3909195f4cf67c5562a" 
SRCREV_common = "dd2f054febf4a6c00f2343686efb775948a8bff4" 

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/client_golang/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://src/${GO_IMPORT}/common/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    "

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS +="\
            github.com-julienschmidt-httprouter \
            "