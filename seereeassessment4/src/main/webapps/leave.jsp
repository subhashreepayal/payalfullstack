 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="jquery.js"></script>
<script>
    $(document).ready(function(){
        $("#emp_id").change(function(){
            $.ajax({
                url:"getleave",
                type:"POST",
                dataType:"JSON",
                data:{emp_id:$(this).val()},
                success:function(res){
                    op="";
                    $.each(res,function(k,v){
                        op=op+"<option value="+v.leave_id+">"+v.leave_name+"</option>";
                    })
                    $("#leave_id").html(op);
                }


            })
        })
        $("#leave_name").change(function()
        {
            $.ajax({
                url:"getnoofleave",
                type:"POST",
                dataType:"JSON",
                data:{emp_id:$(this).val(),emp_id:$("#emp_id").val()},
                success:function(res){
                   alert(res[0].no_of_leave);
                    $("#leave_id").html(op);
                }
        })
      })
    })
</script>
EMP NAME:<select name="emp_id" id="emp_id" >
    <c:forEach var="emp" items="${emp}">
        <option value="${emp.emp_id}"> ${emp.emp_name}</option>
    </c:forEach>
</select>
LEAVE:<select id="leave_id" name="leave_id"></select>

</br>
<input type="text" id="o_no_of_leave" name="o_no of_leave"/>
No of leave:<input type="text" id="o_no_of_leave" name="o_no of_leave"/>
<br/>
<input type="submit" value="Apply"/>
