// Linkedlist
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#pragma pack(1)

struct node
{
    int data;
    struct node *next;
};


typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node**  PPNODE;


void Display(PNODE first)
{
    PNODE temp = NULL;
    temp = first;

    while (temp != NULL)
    {
        printf("|%d|->",temp->data);
        temp = temp->next;
    }

    printf("NULL\n");
}


int Count(PNODE first)
{
    int iCnt = 0;
    PNODE temp = NULL;
    temp = first;

    while (temp != NULL)
    {
        temp = temp->next;
        iCnt++;
    }

    return iCnt;
    
}


void InsertFirst(PPNODE first,int data)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));
    newn->data = data;
    newn->next = NULL;

    if((*first) == NULL)
    {
        (*first) = newn;
    }
    else
    {
        newn->next = (*first);
        (*first) = newn;
    }
}



void InsertLast(PPNODE first,int data)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    newn->data = data;
    newn->next = NULL;

    if((*first) == NULL)
    {
        (*first) = newn;
    }
    else
    {
        temp = (*first);

        while (temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;
    }
}


void InsertAtPos(PPNODE first,int data,int iPos)
{
    PNODE temp = NULL;
    PNODE newn = NULL;
    int i = 0;
    int iLength = Count(*first);
    
    if((iPos < 1) || (iPos > (iLength + 1)))
    {
        printf("At wrong position \n");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(first,data);
    }
    else if (iPos == (iLength + 1))
    {
        InsertLast(first,data);
    }
    else
    {
        temp = (*first);

        for(i = 1 ; i < iPos -1 ; i++)
        {
            temp = temp->next;
        }

        newn = (PNODE)malloc(sizeof(NODE));
        newn->data = data;
        newn->next = NULL;

        newn->next = temp->next;
        temp->next = newn;

    }
    
}


void DeleteFirst(PPNODE first)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    if((*first) == NULL)
    {
        return;
    }
    else if((*first)->next == NULL)
    {
        newn = (*first);
        (*first) = NULL;
        free(newn);
        return;
    }
    else
    {
        newn = (*first);
        (*first) = (*first)->next;
        free(newn);
        return;
    }
}


void DeleteLast(PPNODE first)
{
    PNODE temp =NULL;
    if((*first) == NULL)                 
    {
        return;
    }
    else if((*first)->next == NULL)     
    {
        free((*first));
        (*first) = NULL;
        // head = NULL;
    }
    else                                
    {
        temp = (*first);

        while (temp->next->next != NULL) 
        {
            temp = temp->next;
        }

        free(temp->next);
        temp->next = NULL;        
    }
}

void DeleteAtPos(PPNODE first,int iPos)
{
    PNODE temp = NULL;
    PNODE newn = NULL;
    int i = 0;
    int iLength = Count(*first);
    
    if((iPos < 1) || (iPos > (iLength + 1)))
    {
        printf("At wrong position \n");
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst(first);
    }
    else if (iPos == (iLength))
    {
        DeleteLast(first);
    }
    else
    {
        temp = (*first);

        for(i = 1 ; i < iPos -1 ; i++)
        {
            temp = temp->next;

        }

        newn = temp->next;
        temp->next = newn->next;
        newn->next = NULL;
        free(newn);
    }
    
}


bool Search(PNODE Head,int iNo)
{
    PNODE temp = NULL;
    temp = Head;
    bool bFlag = false;

    while (temp != NULL)
    {
        if(temp->data == iNo)
        {
            bFlag = true;
        }
        temp = temp->next;
    }  

    return bFlag;

}

int CountEven(PNODE head)
{
    int iCnt = 0;
    PNODE temp = NULL;

    temp = head;

    while (temp != NULL)
    {
        if((temp->data) %2 == 0)
        {
            iCnt++;
        }

        temp = temp->next;
    }
    
    return iCnt;
}

int CountOdd(PNODE head)
{
    int iCnt = 0;
    PNODE temp = NULL;

    temp = head;
    
    while (temp != NULL)
    {
        if(((temp->data) % 2) == 1)
        {
            iCnt++;
        }

        temp = temp->next;
    }
    
    return iCnt;
}

int main()
{
    PNODE head = NULL;
    bool bRet = false;
    int iRet = 0;

    InsertFirst(&head,101);
    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    Display(head);
    iRet = Count(head);
    printf("Number Of Nodes are : %d\n",iRet);

    InsertLast(&head,111);
    InsertLast(&head,121);
    
    Display(head);
    iRet = Count(head);
    printf("Number Of Nodes are : %d\n",iRet);

    DeleteFirst(&head);

    Display(head);
    iRet = Count(head);
    printf("Number Of Nodes are : %d\n",iRet);

    DeleteLast(&head);

    Display(head);
    iRet = Count(head);
    printf("Number Of Nodes are : %d\n",iRet);

    InsertAtPos(&head,105,4);

    Display(head);
    iRet = Count(head);
    printf("Number Of Nodes are : %d\n",iRet);

    DeleteAtPos(&head,4);
    
    Display(head);
    iRet = Count(head);
    printf("Number Of Nodes are : %d\n",iRet);

    printf("\n\n");
    bRet = Search(head,511);
    if(bRet)
    {
        printf("Node Is present in Linkedlist\n");
    }
    else
    {
        printf("Node Is Not Present in Linkedlist\n");
    }
    
    iRet = CountEven(head);
    printf("Number of EVEN Node : %d\n",iRet);

    iRet = CountOdd(head);
    printf("Number of ODD Node : %d\n",iRet);
    return 0;

}