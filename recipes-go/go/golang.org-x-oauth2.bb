DESCRIPTION = "Go OAuth2"
SECTION = "net"
HOMEPAGE = "https://godoc.org/golang.org/x/oauth2"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=704b1e0c436dbf193e7dcbd4cf06ec81"

GO_IMPORT = "golang.org/x/oauth2"

DEPENDS = "\
	golang.org-x-net \
	cloud.google.com-go \
"

inherit go

SRC_URI = "\
	git://github.com/golang/oauth2.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT} \
	"

SRCREV = "a6bd8cefa1811bd24b86f8902872e4e8225f74c4"
