/**
 * 全选
 */
 function allSelect() {
            if ($(":checkbox").attr("checked") != "checked") {
                $(":checkbox").attr("checked", "checked");
            }
            else {
                $(":checkbox").removeAttr("checked");
            }
        }
 function confirmdelete(){
	    if(confirm("你确定要删除？"))
	    {
	        
	        alert("删除");
	    }
	    else
	    {
	        alert("取消删除");
	        return false;
	    }
	}
function deleteBatch(basePath){
		$('#mainForm').attr("action","DoDeleteItemsServlet");
		$('#mainForm').submit();
	}
function deleteBatchcsr(basePath){
	$('#csrmainForm').attr("action","CSRTEST_DoDeleteBatchServlet");
	$('#csrmainForm').submit();
}
function deleteBatchtest(basePath){
	$('#testmainForm').attr("action","CSRTEST_DoDeleteBatchServlet");
	$('#testmainForm').submit();
}